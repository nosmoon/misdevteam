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


public class HD_AFFR_9605_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_no;
	public String expn_clsf_cd;
	public String aply_obj_clsf;
	public String str_dt;
	public String limt_amt;

	public HD_AFFR_9605_LDM(){}
	public HD_AFFR_9605_LDM(String cmpy_cd, String mang_no, String expn_clsf_cd, String aply_obj_clsf, String str_dt, String limt_amt){
		this.cmpy_cd = cmpy_cd;
		this.mang_no = mang_no;
		this.expn_clsf_cd = expn_clsf_cd;
		this.aply_obj_clsf = aply_obj_clsf;
		this.str_dt = str_dt;
		this.limt_amt = limt_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setExpn_clsf_cd(String expn_clsf_cd){
		this.expn_clsf_cd = expn_clsf_cd;
	}
	
	public void setAply_obj_clsf(String aply_obj_clsf){
		this.aply_obj_clsf = aply_obj_clsf;
	}
	
	public void setStr_dt(String str_dt){
		this.str_dt = str_dt;
	}

	public void setLimt_amt(String limt_amt){
		this.limt_amt = limt_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getExpn_clsf_cd(){
		return this.expn_clsf_cd;
	}
	
	public String getAply_obj_clsf(){
		return this.aply_obj_clsf;
	}
	
	public String getStr_dt(){
		return this.str_dt;
	}

	public String getLimt_amt(){
		return this.limt_amt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9605_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9605_LDM dm = (HD_AFFR_9605_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_no);
		cstmt.setString(5, dm.expn_clsf_cd);
		cstmt.setString(6, dm.aply_obj_clsf);
		cstmt.setString(7, dm.str_dt);
		cstmt.setString(8, dm.limt_amt);
		cstmt.registerOutParameter(9, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9605_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("expn_clsf_cd = [" + getExpn_clsf_cd() + "]");
		System.out.println("aply_obj_clsf = [" + getAply_obj_clsf() + "]");
		System.out.println("str_dt = [" + getStr_dt() + "]");
		System.out.println("limt_amt = [" + getLimt_amt() + "]");
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
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String expn_clsf_cd = req.getParameter("expn_clsf_cd");
if( expn_clsf_cd == null){
	System.out.println(this.toString+" : expn_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : expn_clsf_cd is "+expn_clsf_cd );
}
String str_dt = req.getParameter("str_dt");
if( str_dt == null){
	System.out.println(this.toString+" : str_dt is null" );
}else{
	System.out.println(this.toString+" : str_dt is "+str_dt );
}
String limt_amt = req.getParameter("limt_amt");
if( limt_amt == null){
	System.out.println(this.toString+" : limt_amt is null" );
}else{
	System.out.println(this.toString+" : limt_amt is "+limt_amt );
}
String sply_amt = req.getParameter("sply_amt");
if( sply_amt == null){
	System.out.println(this.toString+" : sply_amt is null" );
}else{
	System.out.println(this.toString+" : sply_amt is "+sply_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
String str_dt = Util.checkString(req.getParameter("str_dt"));
String limt_amt = Util.checkString(req.getParameter("limt_amt"));
String sply_amt = Util.checkString(req.getParameter("sply_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String expn_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_clsf_cd")));
String str_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("str_dt")));
String limt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("limt_amt")));
String sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_no(mang_no);
dm.setExpn_clsf_cd(expn_clsf_cd);
dm.setStr_dt(str_dt);
dm.setLimt_amt(limt_amt);
dm.setSply_amt(sply_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 13 16:50:52 KST 2017 */