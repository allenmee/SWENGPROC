/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIWS;

/**
 *
 * @author EBIEMI
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MmapExample {

    static MappedByteBuffer b;
    
    private static void flipOne (int addr) {
	byte v;
	b.position(addr);
	v = b.get();
	b.position(addr);
	b.put((byte) (1-v));
    }

    private static void setZero (int addr) {
	byte v;
	b.position(addr);
	v = b.get();
	b.position(addr);
	b.put((byte) 0);
    }

    public static void main( String[] args ) throws Throwable {
	FileChannel fc = new RandomAccessFile(new File("ciwsmem.dat"), "rw").getChannel();
	b = fc.map( FileChannel.MapMode.READ_WRITE, 0, 1024 );

        int c;
	setZero(82);
	setZero(92);
	setZero(93);
	setZero(94);
	while (true) {
	    b.position(80); b.put((byte) 5);
	    b.position(81); b.put((byte) 10);
	    b.position(0);
	    System.out.print("Master mode = ");
	    System.out.println(b.get());
	    System.out.print("Weapon mode = ");
	    System.out.println(b.get());
	    System.out.println("");
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException ie) {
	    }
	    b.position(80); b.put((byte) 10);
	    b.position(81); b.put((byte) 20);
	    flipOne(82);
	    flipOne(92);
	    flipOne(93);
	    flipOne(94);
	    try {
		Thread.sleep(200);
	    } catch (InterruptedException ie) {
	    }
        }
    }
}

