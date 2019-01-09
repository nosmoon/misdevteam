/***************************************************************************************************
* 파일명 : MT_PRNPAP_1000DAO
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-03-30
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.prnpap.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;

import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

public class MT_PRNPAP_3000DAO {
	//
	public MT_PRNPAP_3000_LDataSet mt_prnpap_3000_l(MT_PRNPAP_3000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3000_LDataSet ds = (MT_PRNPAP_3000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
//	 일일재고 조회
	public MT_PRNPAP_3001_LDataSet mt_prnpap_3001_l(MT_PRNPAP_3001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3001_LDataSet ds = (MT_PRNPAP_3001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 일일재고 등록/수정
	public MT_PRNPAP_3002_ADataSet mt_prnpap_3002_a(MT_PRNPAP_3002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3002_ADataSet ds = (MT_PRNPAP_3002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 일일재고 금일입고 롤당 중량 구하기
	public MT_PRNPAP_3003_MDataSet mt_prnpap_3003_m(MT_PRNPAP_3003_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3003_MDataSet ds = (MT_PRNPAP_3003_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 일일재고 공장구분
	public MT_PRNPAP_3004_LDataSet mt_prnpap_3004_l(MT_PRNPAP_3004_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3004_LDataSet ds = (MT_PRNPAP_3004_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
//	 상세 내역 TAB  화면 조회
	public MT_PRNPAP_3006_LDataSet mt_prnpap_3006_l(MT_PRNPAP_3006_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3006_LDataSet ds = (MT_PRNPAP_3006_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
//	 분공장 마감 처리
	public MT_PRNPAP_3007_UDataSet mt_prnpap_3007_u(MT_PRNPAP_3007_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3007_UDataSet ds = (MT_PRNPAP_3007_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	//	 분공장 마감 취소 처리
	public MT_PRNPAP_3008_UDataSet mt_prnpap_3008_u(MT_PRNPAP_3008_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3008_UDataSet ds = (MT_PRNPAP_3008_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	//	 지고재고 자동생성
	public MT_PRNPAP_3009_LDataSet mt_prnpap_3009_l(MT_PRNPAP_3009_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3009_LDataSet ds = (MT_PRNPAP_3009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
//	 지고재고 자동생성
	public MT_PRNPAP_3011_UDataSet mt_prnpap_3011_l(MT_PRNPAP_3011_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3011_UDataSet ds = (MT_PRNPAP_3011_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	// 용지일일재고및파지확인  조회
	public MT_PRNPAP_3100_LDataSet mt_prnpap_3100_l(MT_PRNPAP_3100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3100_LDataSet ds = (MT_PRNPAP_3100_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	// 일일재고지고 등록/수정/삭제
	public MT_PRNPAP_3101_ADataSet mt_prnpap_3101_a(MT_PRNPAP_3101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3101_ADataSet ds = (MT_PRNPAP_3101_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3102_LDataSet mt_prnpap_3102_l(MT_PRNPAP_3102_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3102_LDataSet ds = (MT_PRNPAP_3102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3103_LDataSet mt_prnpap_3103_l(MT_PRNPAP_3103_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3103_LDataSet ds = (MT_PRNPAP_3103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3104_LDataSet mt_prnpap_3104_l(MT_PRNPAP_3104_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3104_LDataSet ds = (MT_PRNPAP_3104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일재고중잔지 등록/수정/삭제
	public MT_PRNPAP_3201_ADataSet mt_prnpap_3201_a(MT_PRNPAP_3201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3201_ADataSet ds = (MT_PRNPAP_3201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3203_LDataSet mt_prnpap_3203_l(MT_PRNPAP_3203_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3203_LDataSet ds = (MT_PRNPAP_3203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일재고중잔지 조회
	public MT_PRNPAP_3200_LDataSet mt_prnpap_3200_l(MT_PRNPAP_3200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3200_LDataSet ds = (MT_PRNPAP_3200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일재고윤전기 등록/수정/삭제
	public MT_PRNPAP_3301_ADataSet mt_prnpap_3301_a(MT_PRNPAP_3301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3301_ADataSet ds = (MT_PRNPAP_3301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 잔량산출기준 조회
	public MT_PRNPAP_3202_MDataSet mt_prnpap_3202_m(MT_PRNPAP_3202_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3202_MDataSet ds = (MT_PRNPAP_3202_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일재고윤전기 조회
	public MT_PRNPAP_3300_LDataSet mt_prnpap_3300_l(MT_PRNPAP_3300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3300_LDataSet ds = (MT_PRNPAP_3300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일재고윤전기 호기 콤보 조회
	public MT_PRNPAP_3303_MDataSet mt_prnpap_3303_m(MT_PRNPAP_3303_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3303_MDataSet ds = (MT_PRNPAP_3303_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

	// 선인쇄 사용량 등록/수정/삭제
	public MT_PRNPAP_3401_ADataSet mt_prnpap_3401_a(MT_PRNPAP_3401_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3401_ADataSet ds = (MT_PRNPAP_3401_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 선인쇄 사용량 조회
	public MT_PRNPAP_3400_LDataSet mt_prnpap_3400_l(MT_PRNPAP_3400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3400_LDataSet ds = (MT_PRNPAP_3400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 선인쇄사용량 섹션 콤보 가져오기
	public MT_PRNPAP_3402_MDataSet mt_prnpap_3402_m(MT_PRNPAP_3402_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3402_MDataSet ds = (MT_PRNPAP_3402_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 선인쇄 파지량 조회
	public MT_PRNPAP_3403_LDataSet mt_prnpap_3403_l(MT_PRNPAP_3403_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3403_LDataSet ds = (MT_PRNPAP_3403_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 선인쇄 파지량  등록/수정
	public MT_PRNPAP_3404_ADataSet mt_prnpap_3404_a(MT_PRNPAP_3404_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3404_ADataSet ds = (MT_PRNPAP_3404_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	//	 파지량 입력 여부 조회
	public MT_PRNPAP_3405_LDataSet mt_prnpap_3405_l(MT_PRNPAP_3405_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3405_LDataSet ds = (MT_PRNPAP_3405_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    //	 선인쇄 파지량 데이터  조회
	public MT_PRNPAP_3406_LDataSet mt_prnpap_3406_l(MT_PRNPAP_3406_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3406_LDataSet ds = (MT_PRNPAP_3406_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
//	 선인쇄 파지량 데이터  조회
	public MT_PRNPAP_3407_LDataSet mt_prnpap_3407_l(MT_PRNPAP_3407_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3407_LDataSet ds = (MT_PRNPAP_3407_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3409_IDataSet mt_prnpap_3409_l(MT_PRNPAP_3409_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3409_IDataSet ds = (MT_PRNPAP_3409_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3410_DDataSet mt_prnpap_3410_l(MT_PRNPAP_3410_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3410_DDataSet ds = (MT_PRNPAP_3410_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3411_LDataSet mt_prnpap_3411_l(MT_PRNPAP_3411_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3411_LDataSet ds = (MT_PRNPAP_3411_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3412_LDataSet mt_prnpap_3412_l(MT_PRNPAP_3412_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3412_LDataSet ds = (MT_PRNPAP_3412_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3414_IDataSet mt_prnpap_3414_l(MT_PRNPAP_3414_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3414_IDataSet ds = (MT_PRNPAP_3414_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3415_DDataSet mt_prnpap_3415_l(MT_PRNPAP_3415_DDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3415_DDataSet ds = (MT_PRNPAP_3415_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3416_LDataSet mt_prnpap_3416_l(MT_PRNPAP_3416_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3416_LDataSet ds = (MT_PRNPAP_3416_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	public MT_PRNPAP_3417_UDataSet mt_prnpap_3417_u(MT_PRNPAP_3417_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3417_UDataSet ds = (MT_PRNPAP_3417_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일파지량 조회
	public MT_PRNPAP_3500_LDataSet mt_prnpap_3500_l(MT_PRNPAP_3500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3500_LDataSet ds = (MT_PRNPAP_3500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일파지량  등록/수정
	public MT_PRNPAP_3501_ADataSet mt_prnpap_3501_a(MT_PRNPAP_3501_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3501_ADataSet ds = (MT_PRNPAP_3501_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	// 용지일일파지량 섹션 콤보 조회
	public MT_PRNPAP_3502_MDataSet mt_prnpap_3502_m(MT_PRNPAP_3502_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3502_MDataSet ds = (MT_PRNPAP_3502_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
//	 용지일일파지량 조회
	public MT_PRNPAP_3503_LDataSet mt_prnpap_3503_l(MT_PRNPAP_3503_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISMAT");
		MT_PRNPAP_3503_LDataSet ds = (MT_PRNPAP_3503_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}

}