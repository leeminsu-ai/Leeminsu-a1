package inherit6;

public class File {
	String filename;
	int filesize;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public File(String filename,int filesize) {
		setFilename(filename);
		setFilesize(filesize);
	}
	void excute()
	{
		System.out.println("실행");
	}
	void information()
	{
		System.out.println();
	}
}
