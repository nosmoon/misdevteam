/**************************************************************************************************
* 파일명 	: SS_S_SMSDM.java
* 기능 		: 지국INFO-발송노선 SMS불러오기 DM
* 작성일자 	: 2004-04-01
* 작성자 	: 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역 	:
* 수정자 	:
* 수정일자 	:
* 백업 		:
**************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 지국INFO-발송노선 SMS불러오기 DM
 */

public class SS_S_SMSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;

	public SS_S_SMSDM(){}
	public SS_S_SMSDM(String bocd){
		this.bocd = bocd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBocd(){
		return this.bocd;
	}

    public String getSQL(){
         return "";
    }

    public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
        SS_S_SMSDM dm = (SS_S_SMSDM)bdm;
    }

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_S_SMSDataSet();
	}
}

/* 작성시간 : Wed Feb 11 11:39:13 KST 2004 */