package nguyenanhkiet25748841;

import java.time.LocalDate;

public class SanPhamThucPham extends HangHoa {
	private LocalDate ngayHetHan;
	
	public SanPhamThucPham(String maSP, String tenSP, LocalDate ngaySanXuat, double giaNhap, int soLuongTon, LocalDate ngayHetHan) throws Exception {
		super(maSP, tenSP, ngaySanXuat, giaNhap, soLuongTon);
		setNgayHetHan(ngayHetHan);
	}
	
	public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
		if(!ngayHetHan.isBefore(LocalDate.now()) && !ngayHetHan.isBefore(getNgaySanXuat())) {
			this.ngayHetHan = ngayHetHan;
		} else throw new Exception("Ngay het han khong hop le");
	}

	@Override
	public double getGiaBan() {
		if(ngayHetHan.isBefore(LocalDate.now())) {
			return 0;
		}
		return giaNhap +giaNhap*0.05;
	}
	
	@Override
	public String getLoai() {
		return "Thuc pham";
	}

	@Override
	public String toString() {
		return super.toString() + "SanPhamThucPham [ngayHetHan=" + ngayHetHan.format(DTF) + "]";
	}
	
	
}
