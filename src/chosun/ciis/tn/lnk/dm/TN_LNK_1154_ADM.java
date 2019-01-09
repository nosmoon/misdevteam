/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1154_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String excl_pmnt_idx;

	public TN_LNK_1154_ADM(){}
	public TN_LNK_1154_ADM(String cmpy_cd, String excl_pmnt_idx){
		this.cmpy_cd = cmpy_cd;
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1154_A(? ,? ,? ,? ,? ,? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1154_ADM dm = (TN_LNK_1154_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.excl_pmnt_idx);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.BLOB);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1154_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("excl_pmnt_idx = [" + getExcl_pmnt_idx() + "]");
	}
}

/* 작성시간 : Mon Jul 25 15:45:59 KST 2016 */