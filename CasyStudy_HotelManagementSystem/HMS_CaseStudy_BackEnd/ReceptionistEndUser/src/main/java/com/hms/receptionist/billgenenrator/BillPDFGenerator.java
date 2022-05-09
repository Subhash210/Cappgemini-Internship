package com.hms.receptionist.billgenenrator;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.hms.receptionist.model.Bill;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class BillPDFGenerator {

	public void generate(HttpServletResponse response, Bill bill) throws DocumentException, IOException {

		// Creating the Object of Document
		Document document = new Document(PageSize.A4);

		// Getting instance of PdfWriter
		PdfWriter.getInstance(document, response.getOutputStream());

		// Opening the created document to modify it
		document.open();

		// Creating font
		// Setting font style and size
		Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		fontTiltle.setSize(20);

		// Creating paragraph
		Paragraph paragraph = new Paragraph("ABC Hotel Bill", fontTiltle);

		// Aligning the paragraph in document
		paragraph.setAlignment(Paragraph.ALIGN_CENTER);

		// Adding the created paragraph in document
		document.add(paragraph);

		// Creating a table of 2 columns
		PdfPTable table = new PdfPTable(2);

		// Setting width of table, its columns and spacing
		table.setWidthPercentage(100f);
		table.setWidths(new int[] { 2, 2 });
		table.setSpacingBefore(5);

		// Create Table Cells for table header
		PdfPCell cell = new PdfPCell();

		// Setting the background color and padding
		cell.setBackgroundColor(CMYKColor.GRAY);
		cell.setPadding(5);

		// Creating font
		// Setting font style and size
		Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
		font.setColor(CMYKColor.WHITE);

		// Adding Bill details
		table.addCell("Date");
		table.addCell(String.valueOf(bill.getDate()));

		table.addCell("Bill Number");
		table.addCell(String.valueOf(bill.getBillNumber()));

		table.addCell("Guest Code");
		table.addCell(String.valueOf(bill.getGuestCode()));

		table.addCell("Quantity");
		table.addCell(String.valueOf(bill.getQuantity()));

		table.addCell("Unit");
		table.addCell(String.valueOf(bill.getUnit()));

		table.addCell("Service");
		table.addCell(String.valueOf(bill.getServices()));

		table.addCell("Taxes");
		table.addCell(String.valueOf(bill.getTaxes()));

		table.addCell("Total Price");
		table.addCell(String.valueOf(bill.getTotalPrice_()));
		// Adding the created table to document
		document.add(table);

		// Closing the document
		document.close();

	}
}