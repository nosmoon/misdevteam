/***************************************************************************************************
 * 파일명 : 
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

package chosun.ciis.is.snd.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;
import java.sql.SQLException;

import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class IsSnd1000DAO {
	
    public IS_SND_1000_MDataSet is_snd_1000_m(IS_SND_1000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1000_MDataSet ds = (IS_SND_1000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1010_LDataSet is_snd_1010_l(IS_SND_1010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1010_LDataSet ds = (IS_SND_1010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1020_ADataSet is_snd_1020_a(IS_SND_1020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1020_ADataSet ds = (IS_SND_1020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1100_MDataSet is_snd_1100_m(IS_SND_1100_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1100_MDataSet ds = (IS_SND_1100_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1110_LDataSet is_snd_1110_l(IS_SND_1110_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1110_LDataSet ds = (IS_SND_1110_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1120_LDataSet is_snd_1120_l(IS_SND_1120_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1120_LDataSet ds = (IS_SND_1120_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1200_MDataSet is_snd_1200_m(IS_SND_1200_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1200_MDataSet ds = (IS_SND_1200_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1210_LDataSet is_snd_1210_l(IS_SND_1210_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1210_LDataSet ds = (IS_SND_1210_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1220_LDataSet is_snd_1220_l(IS_SND_1220_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1220_LDataSet ds = (IS_SND_1220_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1230_LDataSet is_snd_1230_l(IS_SND_1230_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1230_LDataSet ds = (IS_SND_1230_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1240_LDataSet is_snd_1240_l(IS_SND_1240_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1240_LDataSet ds = (IS_SND_1240_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1250_LDataSet is_snd_1250_l(IS_SND_1250_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1250_LDataSet ds = (IS_SND_1250_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1255_LDataSet is_snd_1255_l(IS_SND_1255_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1255_LDataSet ds = (IS_SND_1255_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1260_ADataSet is_snd_1260_a(IS_SND_1260_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1260_ADataSet ds = (IS_SND_1260_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public IS_SND_1300_MDataSet is_snd_1300_m(IS_SND_1300_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1300_MDataSet ds = (IS_SND_1300_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1310_LDataSet is_snd_1310_l(IS_SND_1310_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1310_LDataSet ds = (IS_SND_1310_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1400_MDataSet is_snd_1400_m(IS_SND_1400_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1400_MDataSet ds = (IS_SND_1400_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1410_LDataSet is_snd_1410_l(IS_SND_1410_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1410_LDataSet ds = (IS_SND_1410_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1420_LDataSet is_snd_1420_l(IS_SND_1420_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1420_LDataSet ds = (IS_SND_1420_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1430_LDataSet is_snd_1430_l(IS_SND_1430_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1430_LDataSet ds = (IS_SND_1430_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1500_MDataSet is_snd_1500_m(IS_SND_1500_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1500_MDataSet ds = (IS_SND_1500_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1510_LDataSet is_snd_1510_l(IS_SND_1510_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1510_LDataSet ds = (IS_SND_1510_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1520_LDataSet is_snd_1520_l(IS_SND_1520_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1520_LDataSet ds = (IS_SND_1520_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1530_ADataSet is_snd_1530_a(IS_SND_1530_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1530_ADataSet ds = (IS_SND_1530_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1700_MDataSet is_snd_1700_m(IS_SND_1700_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1700_MDataSet ds = (IS_SND_1700_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1710_LDataSet is_snd_1710_l(IS_SND_1710_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1710_LDataSet ds = (IS_SND_1710_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1720_ADataSet is_snd_1720_a(IS_SND_1720_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1720_ADataSet ds = (IS_SND_1720_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    
    public IS_SND_1800_MDataSet is_snd_1800_m(IS_SND_1800_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1800_MDataSet ds = (IS_SND_1800_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    
    public IS_SND_1810_LDataSet is_snd_1810_l(IS_SND_1810_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISISP");
        IS_SND_1810_LDataSet ds = (IS_SND_1810_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
}
