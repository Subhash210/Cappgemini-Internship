package com.hms.owner.generator;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.hms.owner.models.Staff;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class StaffPDFGenerator {

	public void generate(HttpServletResponse response, List<Staff> listOfStaff) throws DocumentException, IOException {

		// Creating the Object of Document
		Document document = new Document(PageSize.A4);

		// Getting instance of PdfWriter
		PdfWriter.getInstance(document, response.getOutputStream());

		// Opening the created document to modify it
		document.open();

		// Creating font
		// Setting font style and size
		Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		fontTiltle.setSize(30);

		Font fontTiltle1 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		fontTiltle1.setSize(20);

		// Creating paragraph
		Paragraph paragraph = new Paragraph("ABC Hotel ", fontTiltle);
		Paragraph paragraph1 = new Paragraph("Staff Report ", fontTiltle1);

		// Aligning the paragraph in document
		paragraph.setAlignment(Paragraph.ALIGN_CENTER);
		paragraph1.setAlignment(Paragraph.ALIGN_CENTER);

		// Adding the created paragraph in document
		document.add(paragraph);
		document.add(paragraph1);

		// Creating a table of 2 columns
		PdfPTable table = new PdfPTable(6);

		// Setting width of table, its columns and spacing
		table.setWidthPercentage(100f);
		table.setWidths(new int[] { 3, 6, 6, 6, 6, 6 });
		table.setSpacingBefore(7);

		// Create Table Cells for table header
		PdfPCell cell = new PdfPCell();

		// Setting the background color and padding
		cell.setBackgroundColor(CMYKColor.GRAY);
		cell.setPadding(5);

		// Creating font
		// Setting font style and size
		Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		font.setColor(CMYKColor.WHITE);

		// Adding headings in the created table cell/ header
		// Adding Cell to table
		cell.setPhrase(new Phrase("Sl.no", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Department ID", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Staff Code", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee name", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Phone no", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Salary ", font));
		table.addCell(cell);

		int i = 1;

		for (Staff staff : listOfStaff) {

			// Adding Bill details
			table.addCell(String.valueOf(i));

			table.addCell(String.valueOf(staff.getDepartmentId()));

			table.addCell(String.valueOf(staff.getStaffCode()));

			table.addCell(String.valueOf(staff.getEmployeeName()));

			table.addCell(String.valueOf(staff.getPhoneNo()));

			table.addCell(String.valueOf(staff.getSalary()));

			i++;

		}
		// Adding the created table to document
		document.add(table);

		// Closing the document
		document.close();

	}
}