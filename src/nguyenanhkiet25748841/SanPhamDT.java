package nguyenanhkiet25748841;

import java.time.LocalDate;

public class SanPhamDT extends HangHoa {
	private int thoiGianBaoHanh;

	public SanPhamDT(String maSP, String tenSP, LocalDate ngaySanXuat, double giaNhap, int soLuongTon, int thoiGianBaoHanh) {
		super(maSP, tenSP, ngaySanXuat, giaNhap, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}


	@Override
	public double getGiaBan() {
		return giaNhap + giaNhap*0.1 + thoiGianBaoHanh*50000;
	}

	@Override
	public String getLoai() {
		return "Dien Tu";
	}


	@Override
	public String toString() {
		return super.toString() + "SanPhamDT [thoiGianBaoHanh=" + thoiGianBaoHanh + "]";
	}

	
	
	
	
}
