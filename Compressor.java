package Com.tnsif.abstractionmethod;
abstract class Filecompresor{
	abstract void compress(String filename);
	void shoedetailed() {
		System.out.println("Compression started....");
	}
}

class ZipCompressor extends Filecompresor{

	@Override
	void compress(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Compress using Zip...");
		
		int originalsize=100;
		int compressedsize=originalsize*60/100;
		System.out.println("original size:"+ originalsize+"MB"); 
		System.out.println("compress size:"+ compressedsize+"MB"); 
		}
	}

class Gzipcompressor extends Filecompresor{

	@Override
	void compress(String filename) {
		// TODO Auto-generated method stub
		System.out.println("Compress using Zip...");
		
		int originalsize=100;
		int compressedsize=originalsize*50/100;
		System.out.println("original size:"+ originalsize+"MB"); 
		System.out.println("compress size:"+ compressedsize+"MB"); 
		}
	}
	
public class Compressor {
public static void main(String[] args) {
	ZipCompressor z = new ZipCompressor();
	z.compress("project.zip");
	System.out.println();
	
	Gzipcompressor g = new Gzipcompressor();
	g.compress("project.zip");
	}
}
