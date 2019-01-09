/***************************************************************************************************
 * 파일명 : AdNmd1000DAO.java
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

package chosun.ciis.ad.nmd.dao;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;
import java.sql.*;
import oracle.sql.*;
import oracle.jdbc.*;

/**
 * 
 */
public class AdNmd1000DAO {

	 public AD_NMD_1010_ADataSet ad_nmd_1010_a(AD_NMD_1010_ADM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_NMD_1010_ADataSet ds = (AD_NMD_1010_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds;
	    }    
	 public AD_NMD_1011_ADataSet ad_nmd_1011_a(AD_NMD_1011_ADM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_NMD_1011_ADataSet ds = (AD_NMD_1011_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds;
	    }  
	 public AD_NMD_1020_LDataSet ad_nmd_1020_l(AD_NMD_1020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_1020_LDataSet ds = (AD_NMD_1020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }   
	 public AD_NMD_1030_ADataSet ad_nmd_1030_a(AD_NMD_1030_ADM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_NMD_1030_ADataSet ds = (AD_NMD_1030_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds;
	    } 
	 public AD_NMD_1040_ADataSet ad_nmd_1040_a(AD_NMD_1040_ADM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_NMD_1040_ADataSet ds = (AD_NMD_1040_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds;
	    } 
	 public AD_NMD_1050_ADataSet ad_nmd_1050_a(AD_NMD_1050_ADM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_NMD_1050_ADataSet ds = (AD_NMD_1050_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds;
	    } 	 
	 public AD_NMD_1051_ADataSet ad_nmd_1051_a(AD_NMD_1051_ADM dm) throws AppException {
	        DBManager manager = new DBManager("MISADV");
	        AD_NMD_1051_ADataSet ds = (AD_NMD_1051_ADataSet) manager.executeCall(dm);
	        if (!"".equals(ds.errcode)) {
	            throw new AppException(ds.errcode, ds.errmsg);
	        }
	        return ds;
	    } 	
	 public AD_NMD_2010_LDataSet ad_nmd_2010_l(AD_NMD_2010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_2010_LDataSet ds = (AD_NMD_2010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_2020_ADataSet ad_nmd_2020_a(AD_NMD_2020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_2020_ADataSet ds = (AD_NMD_2020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_2030_ADataSet ad_nmd_2030_a(AD_NMD_2030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_2030_ADataSet ds = (AD_NMD_2030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_3010_LDataSet ad_nmd_3010_l(AD_NMD_3010_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_3010_LDataSet ds = (AD_NMD_3010_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_3020_ADataSet ad_nmd_3020_a(AD_NMD_3020_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_3020_ADataSet ds = (AD_NMD_3020_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_3030_ADataSet ad_nmd_3030_a(AD_NMD_3030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_3030_ADataSet ds = (AD_NMD_3030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_NMD_4000_MDataSet ad_nmd_4000_m(AD_NMD_4000_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4000_MDataSet ds = (AD_NMD_4000_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }     
    public AD_NMD_4010_ADataSet ad_nmd_4010_a(AD_NMD_4010_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4010_ADataSet ds = (AD_NMD_4010_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_4020_LDataSet ad_nmd_4020_l(AD_NMD_4020_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4020_LDataSet ds = (AD_NMD_4020_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4021_ADataSet ad_nmd_4021_a(AD_NMD_4021_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4021_ADataSet ds = (AD_NMD_4021_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4030_ADataSet ad_nmd_4030_a(AD_NMD_4030_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4030_ADataSet ds = (AD_NMD_4030_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_NMD_4040_ADataSet ad_nmd_4040_a(AD_NMD_4040_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4040_ADataSet ds = (AD_NMD_4040_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    } 
    public AD_NMD_4061_LDataSet ad_nmd_4061_l(AD_NMD_4061_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4061_LDataSet ds = (AD_NMD_4061_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4062_ADataSet ad_nmd_4062_a(AD_NMD_4062_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4062_ADataSet ds = (AD_NMD_4062_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4063_ADataSet ad_nmd_4063_a(AD_NMD_4063_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4063_ADataSet ds = (AD_NMD_4063_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }
    public AD_NMD_4070_LDataSet ad_nmd_4070_l(AD_NMD_4070_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4070_LDataSet ds = (AD_NMD_4070_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4080_MDataSet ad_nmd_4080_m(AD_NMD_4080_MDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4080_MDataSet ds = (AD_NMD_4080_MDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
    public AD_NMD_4081_LDataSet ad_nmd_4081_l(AD_NMD_4081_LDM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4081_LDataSet ds = (AD_NMD_4081_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4082_ADataSet ad_nmd_4082_a(AD_NMD_4082_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4082_ADataSet ds = (AD_NMD_4082_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }  
    public AD_NMD_4083_ADataSet ad_nmd_4083_a(AD_NMD_4083_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4083_ADataSet ds = (AD_NMD_4083_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }    
    public AD_NMD_4084_ADataSet ad_nmd_4084_a(AD_NMD_4084_ADM dm) throws AppException {
        DBManager manager = new DBManager("MISADV");
        AD_NMD_4084_ADataSet ds = (AD_NMD_4084_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
            throw new AppException(ds.errcode, ds.errmsg);
        }
        return ds;
    }      
}
