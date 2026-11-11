package nguyenanhkiet25748841;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class QuanLySanPham <SanPham> {
	Map<String, HangHoa> ds = new LinkedHashMap<>();
	
	public boolean themSanPham(HangHoa sp) {
		if(ds.containsKey(sp.getMaSP())) {
			return false;
		}
		ds.put(sp.getMaSP(), sp);
		return true;
	}

	public boolean xoaSanPham(String maSP) {
		if (!ds.containsKey(maSP)) {
			return false;
		}

		ds.remove(maSP);
		return true;
	}
	
	public boolean suaSoLuongTon(String maSP, int soLuongMoi) throws Exception {
		HangHoa sp = ds.get(maSP);
		
		if(sp == null) {
			return false;
		}
		
		sp.setSoLuongTon(soLuongMoi);
		return true;
	}
	
	public void xuatSanPhamTheoLoai(String loai) {
		ds.values().stream()
			.filter(sp -> sp.getLoai().equalsIgnoreCase(loai))
			.forEach(sp -> {
				System.out.println(sp);
				System.out.println("-------------");
			});
	}
	
	public void xuatSanPhamGiaBanCaoNhat() {
		Collection<HangHoa> dsm = ds.values();

		OptionalDouble max = dsm.stream()
				.mapToDouble(HangHoa::getGiaBan)
				.max();

		if(!max.isPresent()) {
			System.out.println("Danh sach rong");
			return;
		}

		dsm.stream()
			.filter(sp -> sp.getGiaBan() == max.getAsDouble())
			.forEach(sp -> {
				System.out.println(sp);
				System.out.println("-------------");
			});
	}
}


