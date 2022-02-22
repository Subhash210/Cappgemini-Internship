package Assignment2;
/*Write a program having an abstract class "Persistence" which have two
child classes "FilePersistence","DatabasePersistence".The base class will have a persist()
 method and it is overridden by sub classes
.wite a seperate class of client which will get persistence object 
and invoke persist method on it.(Polymorphism)*/
abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	String file="Data stored in the File";
    	return file;
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	String file="Data stored in the Data Base";
    	return file;
    }
}
//Client class
public class Assignment2Q6 {
    public static void main(String[] args) {
    	Client cl=new Client();
    	System.out.println(cl.filePersist);	
    	System.out.println(cl.databasePersist);
    	
    }
}
class Client{
	Persistence objFilePersist= new FilePersistence();
	Persistence objDatabasePersist= new DatabasePersistence();
	String filePersist=objFilePersist.persist();
	String databasePersist=objDatabasePersist.persist();
}
