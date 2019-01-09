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


public class TN_LNK_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cret_dt;
	public String cret_clsf;

	public TN_LNK_1210_LDM(){}
	public TN_LNK_1210_LDM(String cmpy_cd, String cret_dt, String cret_clsf){
		this.cmpy_cd = cmpy_cd;
		this.cret_dt = cret_dt;
		this.cret_clsf = cret_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCret_dt(String cret_dt){
		this.cret_dt = cret_dt;
	}

	public void setCret_clsf(String cret_clsf){
		this.cret_clsf = cret_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCret_dt(){
		return this.cret_dt;
	}

	public String getCret_clsf(){
		return this.cret_clsf;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_1210_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_1210_LDM dm = (TN_LNK_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cret_dt);
		cstmt.setString(5, dm.cret_clsf);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_1210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cret_dt = [" + getCret_dt() + "]");
		System.out.println("cret_clsf = [" + getCret_clsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String cret_dt = req.getParameter("cret_dt");
if( cret_dt == null){
	System.out.println(this.toString+" : cret_dt is null" );
}else{
	System.out.println(this.toString+" : cret_dt is "+cret_dt );
}
String cret_clsf = req.getParameter("cret_clsf");
if( cret_clsf == null){
	System.out.println(this.toString+" : cret_clsf is null" );
}else{
	System.out.println(this.toString+" : cret_clsf is "+cret_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cret_dt = Util.checkString(req.getParameter("cret_dt"));
String cret_clsf = Util.checkString(req.getParameter("cret_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cret_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_dt")));
String cret_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cret_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCret_dt(cret_dt);
dm.setCret_clsf(cret_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 22 14:19:27 KST 2016 */