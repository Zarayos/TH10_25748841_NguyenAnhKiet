package nguyenanhkiet25748841;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class HangHoa {
	protected String maSP;
	protected String tenSP;
	protected LocalDate ngaySanXuat;
	protected double giaNhap;
	protected int soLuongTon;
	
	
	public String getMaSP() {
		return maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	
	protected static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public void setMaSP(String maSP) throws Exception {
		if(!maSP.isBlank() && !maSP.isEmpty()) {
			this.maSP = maSP;
		} else throw new Exception("Ma san pham khong duoc rong");
	}
	public void setTenSP(String tenSP) throws Exception {
		if(!tenSP.isBlank() && !tenSP.isEmpty()) {
			this.tenSP = tenSP;
		} else throw new Exception("Ten san pham khong duoc rong");
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) throws Exception {
		if(!ngaySanXuat.isAfter(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else throw new Exception("Ngay san xuat khong hop le");
	}
	public void setGiaNhap(double giaNhap) throws Exception {
		if(giaNhap >= 0) {
			this.giaNhap = giaNhap;
		} else throw new Exception("Gia nhap phai duong");
	}
	public void setSoLuongTon(int soLuongTon) throws Exception {
		if(soLuongTon >= 0) {
			this.soLuongTon = soLuongTon;
		} else throw new Exception("So luong ton phai duong");
	}
	
	
	public HangHoa(String maSP, String tenSP, LocalDate ngaySanXuat, double giaNhap, int soLuongTon) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngaySanXuat = ngaySanXuat;
		this.giaNhap = giaNhap;
		this.soLuongTon = soLuongTon;
	}
	

	public abstract double getGiaBan();
	public abstract String getLoai();
	
	@Override
	public String toString() {
		return "HangHoa [maSP=" + maSP + ", tenSP=" + tenSP + ", ngaySanXuat=" + ngaySanXuat + ", giaNhap=" + giaNhap
				+ ", soLuongTon=" + soLuongTon + "]";
	}
	
}
