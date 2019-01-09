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


public class HD_AFFR_9051_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String basi_fr;
	public String basi_to;
	public String usag_clsf_cd;

	public HD_AFFR_9051_LDM(){}
	public HD_AFFR_9051_LDM(String cmpy_cd, String basi_fr, String basi_to, String usag_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.basi_fr = basi_fr;
		this.basi_to = basi_to;
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_fr(String basi_fr){
		this.basi_fr = basi_fr;
	}

	public void setBasi_to(String basi_to){
		this.basi_to = basi_to;
	}

	public void setUsag_clsf_cd(String usag_clsf_cd){
		this.usag_clsf_cd = usag_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_fr(){
		return this.basi_fr;
	}

	public String getBasi_to(){
		return this.basi_to;
	}

	public String getUsag_clsf_cd(){
		return this.usag_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9051_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9051_LDM dm = (HD_AFFR_9051_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.basi_fr);
		cstmt.setString(5, dm.basi_to);
		cstmt.setString(6, dm.usag_clsf_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9051_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_fr = [" + getBasi_fr() + "]");
		System.out.println("basi_to = [" + getBasi_to() + "]");
		System.out.println("usag_clsf_cd = [" + getUsag_clsf_cd() + "]");
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
String basi_fr = req.getParameter("basi_fr");
if( basi_fr == null){
	System.out.println(this.toString+" : basi_fr is null" );
}else{
	System.out.println(this.toString+" : basi_fr is "+basi_fr );
}
String basi_to = req.getParameter("basi_to");
if( basi_to == null){
	System.out.println(this.toString+" : basi_to is null" );
}else{
	System.out.println(this.toString+" : basi_to is "+basi_to );
}
String usag_clsf_cd = req.getParameter("usag_clsf_cd");
if( usag_clsf_cd == null){
	System.out.println(this.toString+" : usag_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : usag_clsf_cd is "+usag_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_fr = Util.checkString(req.getParameter("basi_fr"));
String basi_to = Util.checkString(req.getParameter("basi_to"));
String usag_clsf_cd = Util.checkString(req.getParameter("usag_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_fr")));
String basi_to = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_to")));
String usag_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("usag_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBasi_fr(basi_fr);
dm.setBasi_to(basi_to);
dm.setUsag_clsf_cd(usag_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 12 10:47:02 KST 2016 */