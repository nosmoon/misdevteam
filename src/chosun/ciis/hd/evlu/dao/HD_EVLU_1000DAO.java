/***************************************************************************************************
 * 파일명	: HD_EVLU_1000DAO.java
 * 기능		: 인사시스템 평가관리 DAO 클래스
 * 작성일자	: 
 * 작성자	: 
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역	:
 * 수정자	:
 * 수정일자	:
 * 백업		:
 ***************************************************************************************************/

package chosun.ciis.hd.evlu.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */
public class HD_EVLU_1000DAO {
	
	public HD_EVLU_9999_SDataSet hd_evlu_9999_s(HD_EVLU_9999_SDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_9999_SDataSet ds = (HD_EVLU_9999_SDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
	
    public HD_EVLU_1000_MDataSet initTahds_Evlubasi(HD_EVLU_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1000_MDataSet ds = (HD_EVLU_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1001_LDataSet getListTahds_Evlubasi(HD_EVLU_1001_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1001_LDataSet ds = (HD_EVLU_1001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1002_ADataSet accessTahds_Evlubasi(HD_EVLU_1002_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1002_ADataSet ds = (HD_EVLU_1002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1003_LDataSet getListTahds_Evlusche(HD_EVLU_1003_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1003_LDataSet ds = (HD_EVLU_1003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1004_ADataSet accessTahds_Evlusche(HD_EVLU_1004_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1004_ADataSet ds = (HD_EVLU_1004_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_1100_MDataSet initTahds_Evlubasiitem(HD_EVLU_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1100_MDataSet ds = (HD_EVLU_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1101_LDataSet getListTahds_Evlubasiitem(HD_EVLU_1101_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1101_LDataSet ds = (HD_EVLU_1101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_1102_ADataSet accessTahds_Evlubasiitem(HD_EVLU_1102_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1102_ADataSet ds = (HD_EVLU_1102_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_1103_ADataSet copyTahds_Evlubasiitem(HD_EVLU_1103_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1103_ADataSet ds = (HD_EVLU_1103_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1200_MDataSet initTahds_Evlugrp(HD_EVLU_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1200_MDataSet ds = (HD_EVLU_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1201_LDataSet getListTahds_Evlugrp(HD_EVLU_1201_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1201_LDataSet ds = (HD_EVLU_1201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1202_ADataSet accessTahds_Evlugrp(HD_EVLU_1202_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1202_ADataSet ds = (HD_EVLU_1202_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1300_MDataSet initTahds_Evlupart(HD_EVLU_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1300_MDataSet ds = (HD_EVLU_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1301_LDataSet getListTahds_Evlupart(HD_EVLU_1301_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1301_LDataSet ds = (HD_EVLU_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1302_ADataSet accessTahds_Evlupart(HD_EVLU_1302_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1302_ADataSet ds = (HD_EVLU_1302_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_1400_MDataSet initTahds_Evlugrprflratio(HD_EVLU_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1400_MDataSet ds = (HD_EVLU_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1401_LDataSet getListTahds_Evlugrprflratio(HD_EVLU_1401_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1401_LDataSet ds = (HD_EVLU_1401_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1402_ADataSet accessTahds_Evlugrprflratio(HD_EVLU_1402_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1402_ADataSet ds = (HD_EVLU_1402_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1500_MDataSet initTahds_Evluindx(HD_EVLU_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1500_MDataSet ds = (HD_EVLU_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1501_LDataSet getListTahds_Evlupart2(HD_EVLU_1501_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1501_LDataSet ds = (HD_EVLU_1501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1502_LDataSet getListTahds_Evluindx(HD_EVLU_1502_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1502_LDataSet ds = (HD_EVLU_1502_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1503_ADataSet accessTahds_Evluindx(HD_EVLU_1503_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1503_ADataSet ds = (HD_EVLU_1503_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1504_LDataSet getListTahds_Actindx(HD_EVLU_1504_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1504_LDataSet ds = (HD_EVLU_1504_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_1505_ADataSet accessTahds_Actindx(HD_EVLU_1505_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1505_ADataSet ds = (HD_EVLU_1505_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1600_MDataSet initTahds_Evlugrpdeptmbrmap(HD_EVLU_1600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1600_MDataSet ds = (HD_EVLU_1600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1601_LDataSet getListTahds_Evlugrpcombo(HD_EVLU_1601_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1601_LDataSet ds = (HD_EVLU_1601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1602_LDataSet getListTahds_Evlutotalgrp(HD_EVLU_1602_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1602_LDataSet ds = (HD_EVLU_1602_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1603_LDataSet getListTahds_Evlugrpdeptmbrmapnon(HD_EVLU_1603_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1603_LDataSet ds = (HD_EVLU_1603_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1604_LDataSet getListTahds_Evlugrpdeptmbrmap(HD_EVLU_1604_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1604_LDataSet ds = (HD_EVLU_1604_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1605_ADataSet accessTahds_Evlugrpdeptmbrmap(HD_EVLU_1605_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1605_ADataSet ds = (HD_EVLU_1605_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1700_MDataSet initTahds_Evlugraddivnrate(HD_EVLU_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1700_MDataSet ds = (HD_EVLU_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1701_LDataSet getListTahds_Evlugraddivnrate(HD_EVLU_1701_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1701_LDataSet ds = (HD_EVLU_1701_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1702_ADataSet accessTahds_Evlugraddivnrate(HD_EVLU_1702_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1702_ADataSet ds = (HD_EVLU_1702_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1800_MDataSet initTahds_Evlugrpactindxmap(HD_EVLU_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1800_MDataSet ds = (HD_EVLU_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1801_LDataSet getListTahds_EvlugrpactindxmapCombo(HD_EVLU_1801_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1801_LDataSet ds = (HD_EVLU_1801_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1802_LDataSet getListTahds_EvlugrpactindxmapEvlugrp(HD_EVLU_1802_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1802_LDataSet ds = (HD_EVLU_1802_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1803_LDataSet getListTahds_EvlugrpactindxmapActindx(HD_EVLU_1803_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1803_LDataSet ds = (HD_EVLU_1803_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1804_LDataSet getListTahds_Evlugrpactindxmap(HD_EVLU_1804_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1804_LDataSet ds = (HD_EVLU_1804_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1805_ADataSet accessTahds_Evlugrpactindxmap(HD_EVLU_1805_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1805_ADataSet ds = (HD_EVLU_1805_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1900_MDataSet initTahds_Evluitemgradsetup(HD_EVLU_1900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1900_MDataSet ds = (HD_EVLU_1900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1901_LDataSet getListTahds_Evluitemgradsetup(HD_EVLU_1901_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1901_LDataSet ds = (HD_EVLU_1901_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_1902_ADataSet accessTahds_Evluitemgradsetup(HD_EVLU_1902_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_1902_ADataSet ds = (HD_EVLU_1902_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2000_MDataSet initTahds_Spcaddsbtbasireg(HD_EVLU_2000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2000_MDataSet ds = (HD_EVLU_2000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_2001_LDataSet getListTahds_Spcaddsbtbasireg(HD_EVLU_2001_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2001_LDataSet ds = (HD_EVLU_2001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_2002_ADataSet accessTahds_Spcaddsbtbasireg(HD_EVLU_2002_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2002_ADataSet ds = (HD_EVLU_2002_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_2101_LDataSet getListTahds_Evlugraddivnnops(HD_EVLU_2101_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2101_LDataSet ds = (HD_EVLU_2101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_2102_ADataSet accessTahds_Evlugraddivnnops(HD_EVLU_2102_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2102_ADataSet ds = (HD_EVLU_2102_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2200_MDataSet initTahds_Evluexclchce(HD_EVLU_2200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2200_MDataSet ds = (HD_EVLU_2200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2201_SDataSet getTahds_Evluexcldd(HD_EVLU_2201_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2201_SDataSet ds = (HD_EVLU_2201_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2202_LDataSet getListTahds_Evluexclchceappmt(HD_EVLU_2202_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2202_LDataSet ds = (HD_EVLU_2202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2203_LDataSet getListTahds_Evluexclchcevaca(HD_EVLU_2203_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2203_LDataSet ds = (HD_EVLU_2203_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2204_ADataSet accessTahds_Evluexclchceappmt(HD_EVLU_2204_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2204_ADataSet ds = (HD_EVLU_2204_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2205_ADataSet accessTahds_Evluexclchcevaca(HD_EVLU_2205_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2205_ADataSet ds = (HD_EVLU_2205_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2301_LDataSet getListTahdm_Evluexcl(HD_EVLU_2301_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2301_LDataSet ds = (HD_EVLU_2301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2302_ADataSet accessTahdm_Evluexcl(HD_EVLU_2302_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2302_ADataSet ds = (HD_EVLU_2302_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2303_ADataSet batchTahdm_Evlupersnexcl(HD_EVLU_2303_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2303_ADataSet ds = (HD_EVLU_2303_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2400_MDataSet initTahdm_Evluobj(HD_EVLU_2400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2400_MDataSet ds = (HD_EVLU_2400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2401_LDataSet getListTahdm_Evluobj(HD_EVLU_2401_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2401_LDataSet ds = (HD_EVLU_2401_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2402_ADataSet accessTahdm_Evluobj(HD_EVLU_2402_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2402_ADataSet ds = (HD_EVLU_2402_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2403_ADataSet accessTahdm_Evluobjmapping(HD_EVLU_2403_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2403_ADataSet ds = (HD_EVLU_2403_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2404_ADataSet accessTahdm_Evluobjscorupload(HD_EVLU_2404_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2404_ADataSet ds = (HD_EVLU_2404_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2451_LDataSet getListTahdm_Evluobj(HD_EVLU_2451_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2451_LDataSet ds = (HD_EVLU_2451_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2452_LDataSet getListTahdm_Evluobj(HD_EVLU_2452_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2452_LDataSet ds = (HD_EVLU_2452_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_2453_ADataSet accessTahdm_Evluobjscorupload(HD_EVLU_2453_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2453_ADataSet ds = (HD_EVLU_2453_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2500_MDataSet initTahdm_PgmregEvlupers(HD_EVLU_2500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2500_MDataSet ds = (HD_EVLU_2500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2501_LDataSet getListTahdm_PgmregEvlupers(HD_EVLU_2501_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2501_LDataSet ds = (HD_EVLU_2501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2502_IDataSet insertTahdm_Prsnannc(HD_EVLU_2502_IDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2502_IDataSet ds = (HD_EVLU_2502_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2600_SDataSet initTahds_Tgtevlupersevlu(HD_EVLU_2600_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2600_SDataSet ds = (HD_EVLU_2600_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2601_ADataSet accessTahdd_Evluindxachvdesc(HD_EVLU_2601_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2601_ADataSet ds = (HD_EVLU_2601_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2602_UDataSet updateTahds_Selfevluprocstat(HD_EVLU_2602_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2602_UDataSet ds = (HD_EVLU_2602_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2700_SDataSet initTahds_Prevevluindxachvdesc(HD_EVLU_2700_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2700_SDataSet ds = (HD_EVLU_2700_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_2801_LDataSet accessTahds_SpcaddsbtbasiregPop(HD_EVLU_2801_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2801_LDataSet ds = (HD_EVLU_2801_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //EP포탈 : 보조평가자 평가하기 초기화면
    public HD_EVLU_2900_MDataSet initTahdm_Asstevlupersevlu(HD_EVLU_2900_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2900_MDataSet ds = (HD_EVLU_2900_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 보조평가자 평가하기 목록조회
    public HD_EVLU_2901_LDataSet getListTahdm_Asstevlupersevlu(HD_EVLU_2901_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2901_LDataSet ds = (HD_EVLU_2901_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 보조평가자 평가하기 임시저장
    public HD_EVLU_2902_UDataSet updateTahdm_Asstevlupersevlu(HD_EVLU_2902_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2902_UDataSet ds = (HD_EVLU_2902_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈,인사부 : 보조평가자 등록, 삭제
    public HD_EVLU_2903_ADataSet accessTahdm_Asstevlupersevlu(HD_EVLU_2903_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2903_ADataSet ds = (HD_EVLU_2903_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 보조평가자 평가하기  제출
    public HD_EVLU_2904_UDataSet updateTahdm_AsstevlupersevluDone(HD_EVLU_2904_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_2904_UDataSet ds = (HD_EVLU_2904_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 보조평가자 피평가자 자기평가조회
    public HD_EVLU_3000_SDataSet initTahds_TgtevlupersevluPop(HD_EVLU_3000_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3000_SDataSet ds = (HD_EVLU_3000_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면초기화면
    public HD_EVLU_3100_MDataSet initTahdm_Evlupersgrpper1tms(HD_EVLU_3100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3100_MDataSet ds = (HD_EVLU_3100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 피평가자 그룹목록 조회
    public HD_EVLU_3101_LDataSet getListTahdm_Evlupersgrpper1tms(HD_EVLU_3101_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3101_LDataSet ds = (HD_EVLU_3101_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자평가화면 그룹별 피평가자 목록 조회
    public HD_EVLU_3102_LDataSet getListTahdm_Evluobjgrpper1tms(HD_EVLU_3102_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3102_LDataSet ds = (HD_EVLU_3102_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 피평가자 자기평가보기(3000과동일)
    public HD_EVLU_3103_SDataSet getTahds_Tgtevlupersevluper1tms(HD_EVLU_3103_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3103_SDataSet ds = (HD_EVLU_3103_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 임시저장
    public HD_EVLU_3104_UDataSet updateTahds_Evluobjevlugradper1tms(HD_EVLU_3104_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3104_UDataSet ds = (HD_EVLU_3104_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 반려
    public HD_EVLU_3105_UDataSet updateTahds_Evluobjgivingback1tms(HD_EVLU_3105_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3105_UDataSet ds = (HD_EVLU_3105_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 제출(평가완료)
    public HD_EVLU_3106_UDataSet updateTahds_Evluobjdoneevlu1tms(HD_EVLU_3106_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3106_UDataSet ds = (HD_EVLU_3106_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 잠정등급집계
    public HD_EVLU_3107_UDataSet updateTahds_Evluobjcaltmpgrad1tms(HD_EVLU_3107_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3107_UDataSet ds = (HD_EVLU_3107_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 그룹평가완료
    public HD_EVLU_3108_UDataSet updateTahds_Evluobjdoneevlugrp1tms(HD_EVLU_3108_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3108_UDataSet ds = (HD_EVLU_3108_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 > 조정건의등급 팝업 > 조정건의조회
    public HD_EVLU_3201_SDataSet getTahds_Evluobjmedainfoper1tms(HD_EVLU_3201_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3201_SDataSet ds = (HD_EVLU_3201_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 1차평가자 평가화면 > 조정건의등급 팝업 > 조정건의등록
    public HD_EVLU_3202_UDataSet updateTahds_Evluobjmedainfoper1tms(HD_EVLU_3202_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3202_UDataSet ds = (HD_EVLU_3202_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 2차평가자 평가화면초기화면
    public HD_EVLU_3300_MDataSet initTahdm_Evlupersgrpper2tms(HD_EVLU_3300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3300_MDataSet ds = (HD_EVLU_3300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 2차평가자 평가화면 피평가자 그룹목록 조회
    public HD_EVLU_3301_LDataSet getListTahdm_Evlupersgrpper2tms(HD_EVLU_3301_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3301_LDataSet ds = (HD_EVLU_3301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 2차평가자평가화면 그룹별 피평가자 목록 조회
    public HD_EVLU_3302_LDataSet getListTahdm_Evluobjgrpper2tms(HD_EVLU_3302_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3302_LDataSet ds = (HD_EVLU_3302_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 2차평가자 평가화면 피평가자 자기평가보기(3000과동일)
    public HD_EVLU_3303_SDataSet getTahds_Tgtevlupersevluper2tms(HD_EVLU_3303_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3303_SDataSet ds = (HD_EVLU_3303_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
  //EP포탈 : 2차평가자 평가화면 그룹별 평가완료
    public HD_EVLU_3304_UDataSet updateTahds_Evluobjdoneevlu2tms(HD_EVLU_3304_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3304_UDataSet ds = (HD_EVLU_3304_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //EP포탈 :2차평가자 평가화면 그룹별 평가등급 인원수 조회 
    public HD_EVLU_3305_LDataSet HD_EVLU_3305_LDataSet(HD_EVLU_3305_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3305_LDataSet ds = (HD_EVLU_3305_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //EP포탈 : 2차평가자 평가화면 > 조정의견 팝업 > 조정의견조회
    public HD_EVLU_3401_SDataSet getTahds_Evluobjmedainfoper2tms(HD_EVLU_3401_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3401_SDataSet ds = (HD_EVLU_3401_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //EP포탈 : 2차평가자 평가화면 > 조정의견 팝업 > 조정의견등록
    public HD_EVLU_3402_UDataSet updateTahds_Evluobjmedainfoper2tms(HD_EVLU_3402_UDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3402_UDataSet ds = (HD_EVLU_3402_UDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가진행상태 관리 초기화면
    public HD_EVLU_3500_MDataSet initTahdm_Evluobjmanagestat(HD_EVLU_3500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3500_MDataSet ds = (HD_EVLU_3500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가진행상태 관리 조회
    public HD_EVLU_3501_LDataSet getListTahdm_Evluobjmanagestat(HD_EVLU_3501_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3501_LDataSet ds = (HD_EVLU_3501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가진행상태 관리 등록,수정,삭제
    public HD_EVLU_3502_ADataSet accessTahdm_Evluobjmanagestat(HD_EVLU_3502_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3502_ADataSet ds = (HD_EVLU_3502_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가진행상태 관리 일괄수정
    public HD_EVLU_3503_ADataSet accessTahdm_Evluobjbatchstat(HD_EVLU_3503_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3503_ADataSet ds = (HD_EVLU_3503_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //평가진행상태 관리 : 평가 결과 ERP 데이터 EIS 로 이관 진행상태
    public HD_EVLU_3504_LDataSet hd_evlu_3504_l(HD_EVLU_3504_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3504_LDataSet ds = (HD_EVLU_3504_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //평가진행상태 관리 : 평가 결과 ERP 데이터 EIS 로 이관 작업
    public HD_EVLU_3505_ADataSet hd_evlu_3505_a(HD_EVLU_3505_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3505_ADataSet ds = (HD_EVLU_3505_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가진행상태 조회 초기화면
    public HD_EVLU_3600_MDataSet initTahdm_Evluobjreportstat(HD_EVLU_3600_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3600_MDataSet ds = (HD_EVLU_3600_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가진행상태 조회 목록조회
    public HD_EVLU_3601_LDataSet getListTahdm_Evluobjreportstat(HD_EVLU_3601_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3601_LDataSet ds = (HD_EVLU_3601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가결과조회(인사팀) 초기화면
    public HD_EVLU_3700_MDataSet initTahdm_Evluobjsearchresult(HD_EVLU_3700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3700_MDataSet ds = (HD_EVLU_3700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가결과조회(인사팀) 피평가자 목록조회
    public HD_EVLU_3701_LDataSet getListTahdm_Evluobjsearchresult(HD_EVLU_3701_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3701_LDataSet ds = (HD_EVLU_3701_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    //평가결과조회(인사팀) 피평가자 목록조회
    public HD_EVLU_3702_SDataSet getTahdm_Evluobjsearchresult(HD_EVLU_3702_SDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3702_SDataSet ds = (HD_EVLU_3702_SDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //평가결과 조회 tv조선용 
    public HD_EVLU_3901_LDataSet getTahdm_Evluobjsearchresult(HD_EVLU_3901_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3901_LDataSet ds = (HD_EVLU_3901_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    //평가결과 조회 tv조선용 
    public HD_EVLU_3902_LDataSet getTahdm_Evluobjsearchresult(HD_EVLU_3902_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_3902_LDataSet ds = (HD_EVLU_3902_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

  //------------------------인사평가-----------------------------------//
  //***********************************************************************************************//    
  
    public HD_EVLU_4000_MDataSet hd_evlu_4000_m(HD_EVLU_4000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_4000_MDataSet ds = (HD_EVLU_4000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
  //------------------------파 견 직-----------------------------------//
  //***********************************************************************************************//    
    
    public HD_EVLU_5000_MDataSet hd_evlu_5000_m(HD_EVLU_5000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5000_MDataSet ds = (HD_EVLU_5000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_EVLU_5001_LDataSet hd_evlu_5001_l(HD_EVLU_5001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5001_LDataSet ds = (HD_EVLU_5001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_EVLU_5002_ADataSet hd_evlu_5002_a(HD_EVLU_5002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5002_ADataSet ds = (HD_EVLU_5002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5003_LDataSet hd_evlu_5003_l(HD_EVLU_5003_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5003_LDataSet ds = (HD_EVLU_5003_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5004_ADataSet hd_evlu_5004_a(HD_EVLU_5004_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5004_ADataSet ds = (HD_EVLU_5004_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5100_MDataSet hd_evlu_5100_m(HD_EVLU_5100_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5100_MDataSet ds = (HD_EVLU_5100_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5101_LDataSet hd_evlu_5101_l(HD_EVLU_5101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5101_LDataSet ds = (HD_EVLU_5101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5102_ADataSet hd_evlu_5102_a(HD_EVLU_5102_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5102_ADataSet ds = (HD_EVLU_5102_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_EVLU_5103_ADataSet hd_evlu_5103_a(HD_EVLU_5103_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5103_ADataSet ds = (HD_EVLU_5103_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
    public HD_EVLU_5200_MDataSet hd_evlu_5200_m(HD_EVLU_5200_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5200_MDataSet ds = (HD_EVLU_5200_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5201_LDataSet hd_evlu_5201_l(HD_EVLU_5201_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5201_LDataSet ds = (HD_EVLU_5201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5202_ADataSet hd_evlu_5202_a(HD_EVLU_5202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5202_ADataSet ds = (HD_EVLU_5202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5300_MDataSet hd_evlu_5300_m(HD_EVLU_5300_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5300_MDataSet ds = (HD_EVLU_5300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5301_LDataSet hd_evlu_5301_l(HD_EVLU_5301_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5301_LDataSet ds = (HD_EVLU_5301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5302_UDataSet hd_evlu_5302_u(HD_EVLU_5302_UDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5302_UDataSet ds = (HD_EVLU_5302_UDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5400_MDataSet hd_evlu_5400_m(HD_EVLU_5400_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5400_MDataSet ds = (HD_EVLU_5400_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5401_LDataSet hd_evlu_5401_l(HD_EVLU_5401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5401_LDataSet ds = (HD_EVLU_5401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5402_LDataSet hd_evlu_5402_l(HD_EVLU_5402_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5402_LDataSet ds = (HD_EVLU_5402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5403_ADataSet hd_evlu_5403_a(HD_EVLU_5403_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5403_ADataSet ds = (HD_EVLU_5403_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5404_ADataSet hd_evlu_5404_a(HD_EVLU_5404_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5404_ADataSet ds = (HD_EVLU_5404_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5501_LDataSet hd_evlu_5501_l(HD_EVLU_5501_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5501_LDataSet ds = (HD_EVLU_5501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5502_ADataSet hd_evlu_5502_a(HD_EVLU_5502_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5502_ADataSet ds = (HD_EVLU_5502_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5600_MDataSet hd_evlu_5600_m(HD_EVLU_5600_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5600_MDataSet ds = (HD_EVLU_5600_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5601_LDataSet hd_evlu_5601_l(HD_EVLU_5601_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5601_LDataSet ds = (HD_EVLU_5601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5602_ADataSet hd_evlu_5602_a(HD_EVLU_5602_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5602_ADataSet ds = (HD_EVLU_5602_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5700_MDataSet hd_evlu_5700_m(HD_EVLU_5700_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5700_MDataSet ds = (HD_EVLU_5700_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5701_LDataSet hd_evlu_5701_l(HD_EVLU_5701_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5701_LDataSet ds = (HD_EVLU_5701_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5702_LDataSet hd_evlu_5702_l(HD_EVLU_5702_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5702_LDataSet ds = (HD_EVLU_5702_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5703_ADataSet hd_evlu_5703_a(HD_EVLU_5703_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5703_ADataSet ds = (HD_EVLU_5703_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5704_LDataSet hd_evlu_5704_l(HD_EVLU_5704_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5704_LDataSet ds = (HD_EVLU_5704_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5705_ADataSet hd_evlu_5705_a(HD_EVLU_5705_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5705_ADataSet ds = (HD_EVLU_5705_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5706_LDataSet hd_evlu_5706_l(HD_EVLU_5706_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5706_LDataSet ds = (HD_EVLU_5706_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    

    public HD_EVLU_5900_LDataSet hd_evlu_5900_l(HD_EVLU_5900_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5900_LDataSet ds = (HD_EVLU_5900_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5901_LDataSet hd_evlu_5901_l(HD_EVLU_5901_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5901_LDataSet ds = (HD_EVLU_5901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5902_MDataSet hd_evlu_5902_m(HD_EVLU_5902_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5902_MDataSet ds = (HD_EVLU_5902_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5903_LDataSet hd_evlu_5903_l(HD_EVLU_5903_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5903_LDataSet ds = (HD_EVLU_5903_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5904_ADataSet hd_evlu_5904_a(HD_EVLU_5904_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5904_ADataSet ds = (HD_EVLU_5904_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_5905_ADataSet hd_evlu_5905_a(HD_EVLU_5905_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5905_ADataSet ds = (HD_EVLU_5905_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6200_LDataSet hd_evlu_6200_l(HD_EVLU_6200_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6200_LDataSet ds = (HD_EVLU_6200_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6201_ADataSet hd_evlu_6201_a(HD_EVLU_6201_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6201_ADataSet ds = (HD_EVLU_6201_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6202_ADataSet hd_evlu_6202_a(HD_EVLU_6202_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6202_ADataSet ds = (HD_EVLU_6202_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6203_ADataSet hd_evlu_6203_a(HD_EVLU_6203_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6203_ADataSet ds = (HD_EVLU_6203_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

    //2009-06-08 : 문종호 작업
    public HD_EVLU_5800_MDataSet hd_evlu_5800_m(HD_EVLU_5800_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5800_MDataSet ds = (HD_EVLU_5800_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

    public HD_EVLU_5801_LDataSet hd_evlu_5801_l(HD_EVLU_5801_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5801_LDataSet ds = (HD_EVLU_5801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}

    
    public HD_EVLU_5802_IDataSet hd_evlu_5802_i(HD_EVLU_5802_IDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_5802_IDataSet ds = (HD_EVLU_5802_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6000_MDataSet hd_evlu_6000_m(HD_EVLU_6000_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6000_MDataSet ds = (HD_EVLU_6000_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6001_LDataSet hd_evlu_6001_l(HD_EVLU_6001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6001_LDataSet ds = (HD_EVLU_6001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6002_ADataSet hd_evlu_6002_a(HD_EVLU_6002_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6002_ADataSet ds = (HD_EVLU_6002_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6003_ADataSet hd_evlu_6003_a(HD_EVLU_6003_ADM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6003_ADataSet ds = (HD_EVLU_6003_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6101_LDataSet hd_evlu_6101_l(HD_EVLU_6101_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6101_LDataSet ds = (HD_EVLU_6101_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_6401_LDataSet hd_evlu_6401_l(HD_EVLU_6401_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_6401_LDataSet ds = (HD_EVLU_6401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    //2009-06-08 : 문종호 작업    
     
    public HD_EVLU_8000_LDataSet hd_evlu_8000_l(HD_EVLU_8000_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_8000_LDataSet ds = (HD_EVLU_8000_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
    public HD_EVLU_8001_MDataSet hd_evlu_8001_m(HD_EVLU_8001_MDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_8001_MDataSet ds = (HD_EVLU_8001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		return ds;
	}
    
  //------------------------파 견 직 끝---------------------------------//
  //***********************************************************************************************//   
    

    
    
    
    
    
    
    public HD_EVLU_9000_LDataSet getListTahds_EvlucdCombo(HD_EVLU_9000_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_9000_LDataSet ds = (HD_EVLU_9000_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }

    public HD_EVLU_9001_LDataSet getListTahds_EvlugrpcdCombo(HD_EVLU_9001_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_9001_LDataSet ds = (HD_EVLU_9001_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_9002_LDataSet getListTahds_EvlugrpcdPopup(HD_EVLU_9002_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_9002_LDataSet ds = (HD_EVLU_9002_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_9003_LDataSet getListTahds_AsstevlupersevluPopup(HD_EVLU_9003_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_9003_LDataSet ds = (HD_EVLU_9003_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_9004_ADataSet accessTahds_Evluobjevlustat(HD_EVLU_9004_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISHDL");
        HD_EVLU_9004_ADataSet ds = (HD_EVLU_9004_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public HD_EVLU_4001_LDataSet hd_evlu_4001_l(HD_EVLU_4001_LDM dm) throws AppException {
		DBManager manager = new DBManager("MISHDL");
		HD_EVLU_4001_LDataSet ds = (HD_EVLU_4001_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		return ds;
	}
    
}
