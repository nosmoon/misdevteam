/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_dt;
	public String usag_clsf_cd;
	public String journal_cd;

	public HD_AFFR_9011_LDM(){}
	public HD_AFFR_9011_LDM(String cmpy_cd, String basi_dt, String usag_clsf_cd, String journal_cd){
		this.cmpy_cd = cmpy_cd;
		this.basi_dt = basi_dt;
		this.usag_clsf_cd = usag_clsf_cd;
		this.journal_cd = journal_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setUsag_clsf_cd(String usag_clsf_cd){
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public void setJournal_cd(String journal_cd){
		this.journal_cd = journal_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getUsag_clsf_cd(){
		return this.usag_clsf_cd;
	}

	public String getJournal_cd(){
		return this.journal_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9011_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9011_LDM dm = (HD_AFFR_9011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.basi_dt);
		cstmt.setString(5, dm.usag_clsf_cd);
		cstmt.setString(6, dm.journal_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("usag_clsf_cd = [" + getUsag_clsf_cd() + "]");
		System.out.println("journal_cd = [" + getJournal_cd() + "]");
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
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String usag_clsf_cd = req.getParameter("usag_clsf_cd");
if( usag_clsf_cd == null){
	System.out.println(this.toString+" : usag_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : usag_clsf_cd is "+usag_clsf_cd );
}
String journal_cd = req.getParameter("journal_cd");
if( journal_cd == null){
	System.out.println(this.toString+" : journal_cd is null" );
}else{
	System.out.println(this.toString+" : journal_cd is "+journal_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
String journal_cd = Util.checkString(req.getParameter("journal_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String usag_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("usag_clsf_cd")));
String journal_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("journal_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_dt(basi_dt);
dm.setUsag_clsf_cd(usag_clsf_cd);
dm.setJournal_cd(journal_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 26 18:41:08 KST 2016 */