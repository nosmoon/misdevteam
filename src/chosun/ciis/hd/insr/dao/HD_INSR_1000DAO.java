/***************************************************************************************************
 * 파일명 : PilotDAO.java
 * 기능 : 
 * 작성일자 : 
 * 작성자 : 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.hd.insr.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.db.BaseDataSet;

import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/** 
 * 
 */
public class HD_INSR_1000DAO {
	
	public HD_INSR_1500_LDataSet hd_insr_1500_l(HD_INSR_1500_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1500_LDataSet ds = (HD_INSR_1500_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1600_LDataSet hd_insr_1600_l(HD_INSR_1600_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1600_LDataSet ds = (HD_INSR_1600_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1000_LDataSet hd_insr_1000_l(HD_INSR_1000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1000_LDataSet ds = (HD_INSR_1000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1001_UDataSet hd_insr_1001_u(HD_INSR_1001_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1001_UDataSet ds = (HD_INSR_1001_UDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1002_SDataSet getHd_insr_1002(HD_INSR_1002_SDM dm) throws AppException {

        DBManager manager = new DBManager("MISHDL");
        HD_INSR_1002_SDataSet ds = (HD_INSR_1002_SDataSet) manager.executeCall(dm);

        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
	
	public HD_INSR_1100_LDataSet hd_insr_1100_l(HD_INSR_1100_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1100_LDataSet ds = (HD_INSR_1100_LDataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1101_ADataSet hd_insr_1101_a(HD_INSR_1101_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1101_ADataSet ds = (HD_INSR_1101_ADataSet)manager.executeCall(dm);
		
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1200_LDataSet hd_insr_1200_l(HD_INSR_1200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1200_LDataSet ds = (HD_INSR_1200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1201_UDataSet hd_insr_1201_u(HD_INSR_1201_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1201_UDataSet ds = (HD_INSR_1201_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1300_LDataSet hd_insr_1300_l(HD_INSR_1300_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1300_LDataSet ds = (HD_INSR_1300_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1301_ADataSet hd_insr_1301_a(HD_INSR_1301_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1301_ADataSet ds = (HD_INSR_1301_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INSR_1400_LDataSet hd_insr_1400_l(HD_INSR_1400_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1400_LDataSet ds = (HD_INSR_1400_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1510_LDataSet hd_insr_1510_l(HD_INSR_1510_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1510_LDataSet ds = (HD_INSR_1510_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1511_ADataSet hd_insr_1511_a(HD_INSR_1511_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1511_ADataSet ds = (HD_INSR_1511_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1520_LDataSet hd_insr_1520_l(HD_INSR_1520_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1520_LDataSet ds = (HD_INSR_1520_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1711_LDataSet hd_insr_1711_l(HD_INSR_1711_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1711_LDataSet ds = (HD_INSR_1711_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1712_ADataSet hd_insr_1712_a(HD_INSR_1712_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1712_ADataSet ds = (HD_INSR_1712_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1721_LDataSet hd_insr_1721_l(HD_INSR_1721_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1721_LDataSet ds = (HD_INSR_1721_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_1722_LDataSet hd_insr_1722_l(HD_INSR_1722_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1722_LDataSet ds = (HD_INSR_1722_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INSR_1723_ADataSet hd_insr_1723_a(HD_INSR_1723_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_1723_ADataSet ds = (HD_INSR_1723_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
	public HD_INSR_2000_LDataSet hd_insr_2000_l(HD_INSR_2000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_2000_LDataSet ds = (HD_INSR_2000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INSR_2001_LDataSet hd_insr_2001_l(HD_INSR_2001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_2001_LDataSet ds = (HD_INSR_2001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
	
	public HD_INSR_2002_ADataSet hd_insr_2002_a(HD_INSR_2002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_INSR_2002_ADataSet ds = (HD_INSR_2002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
}

