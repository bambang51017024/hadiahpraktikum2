import java.io.*;
public class hargatiketbuffer
{
	public static void main(String[] args) throws IOException
	{	
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(input);
		String nama,alamat;
		char tipe;
		int bayar;
		double harga;
		double kembalian;
		
		System.out.print("nama: ");
		nama=in.readLine();
		System.out.print("alamat: ");
		alamat=in.readLine();
		System.out.print("pilih tipe pesawat(A-C): ");
		tipe=(char)in.read();
		System.out.println();
		switch(tipe)
		{
			case'A':
			{
				System.out.println("anda memilih pesawat: A ");
				System.out.println("Harga:Rp.5.000.000 ");
				harga=5000000;
				System.out.print("masukkan bayaran: ");
				bayar=Integer.parseInt(in.readLine());
				kembalian=bayar-harga;
				System.out.println();
				System.out.println("nama     : "+nama);
				System.out.println("alamat   : "+alamat);
				System.out.println("kembalian: "+kembalian);
				break;
			}
			case'B':
			{
				System.out.println("anda memilih pesawat: B");
				System.out.println("Harga:Rp.2.000.000 ");
				harga=2000000;
				System.out.print("masukkan bayaran: ");
				bayar=Integer.parseInt(in.readLine());
				kembalian=bayar-harga;
				System.out.println();
				System.out.println("nama     : "+nama);
				System.out.println("alamat   : "+alamat);
				System.out.println("kembalian: "+kembalian);
				break;
			}
			case 'C': 
			{
				System.out.println("anda memilih pesawat: C");
				System.out.println("Harga:Rp.1.000.000 ");
				harga=1000000;
				System.out.print("masukkan bayaran: ");
				bayar=Integer.parseInt(in.readLine());
				kembalian=bayar-harga;
				System.out.println();
				System.out.println("nama     : "+nama);
				System.out.println("alamat   : "+alamat);
				System.out.println("kembalian: "+kembalian);
				break;
			}
			
		}
		
		
		
	}
}