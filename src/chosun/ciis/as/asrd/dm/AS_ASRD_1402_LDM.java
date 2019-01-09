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


package chosun.ciis.as.asrd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.asrd.ds.*;
import chosun.ciis.as.asrd.rec.*;

/**
 * 
 */


public class AS_ASRD_1402_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_dt_fr;
	public String chg_dt_to;
	public String chg_clsf;
	public String aset_no_fr;
	public String aset_no_to;
	public String flag;

	public AS_ASRD_1402_LDM(){}
	public AS_ASRD_1402_LDM(String cmpy_cd, String chg_dt_fr, String chg_dt_to, String chg_clsf, String aset_no_fr, String aset_no_to, String flag){
		this.cmpy_cd = cmpy_cd;
		this.chg_dt_fr = chg_dt_fr;
		this.chg_dt_to = chg_dt_to;
		this.chg_clsf = chg_clsf;
		this.aset_no_fr = aset_no_fr;
		this.aset_no_to = aset_no_to;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_dt_fr(String chg_dt_fr){
		this.chg_dt_fr = chg_dt_fr;
	}

	public void setChg_dt_to(String chg_dt_to){
		this.chg_dt_to = chg_dt_to;
	}

	public void setChg_clsf(String chg_clsf){
		this.chg_clsf = chg_clsf;
	}

	public void setAset_no_fr(String aset_no_fr){
		this.aset_no_fr = aset_no_fr;
	}

	public void setAset_no_to(String aset_no_to){
		this.aset_no_to = aset_no_to;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChg_dt_fr(){
		return this.chg_dt_fr;
	}

	public String getChg_dt_to(){
		return this.chg_dt_to;
	}

	public String getChg_clsf(){
		return this.chg_clsf;
	}

	public String getAset_no_fr(){
		return this.aset_no_fr;
	}

	public String getAset_no_to(){
		return this.aset_no_to;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASRD_1402_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASRD_1402_LDM dm = (AS_ASRD_1402_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_dt_fr);
		cstmt.setString(5, dm.chg_dt_to);
		cstmt.setString(6, dm.chg_clsf);
		cstmt.setString(7, dm.aset_no_fr);
		cstmt.setString(8, dm.aset_no_to);
		cstmt.setString(9, dm.flag);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.asrd.ds.AS_ASRD_1402_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chg_dt_fr = [" + getChg_dt_fr() + "]");
		System.out.println("chg_dt_to = [" + getChg_dt_to() + "]");
		System.out.println("chg_clsf = [" + getChg_clsf() + "]");
		System.out.println("aset_no_fr = [" + getAset_no_fr() + "]");
		System.out.println("aset_no_to = [" + getAset_no_to() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String chg_dt_fr = req.getParameter("chg_dt_fr");
if( chg_dt_fr == null){
	System.out.println(this.toString+" : chg_dt_fr is null" );
}else{
	System.out.println(this.toString+" : chg_dt_fr is "+chg_dt_fr );
}
String chg_dt_to = req.getParameter("chg_dt_to");
if( chg_dt_to == null){
	System.out.println(this.toString+" : chg_dt_to is null" );
}else{
	System.out.println(this.toString+" : chg_dt_to is "+chg_dt_to );
}
String chg_clsf = req.getParameter("chg_clsf");
if( chg_clsf == null){
	System.out.println(this.toString+" : chg_clsf is null" );
}else{
	System.out.println(this.toString+" : chg_clsf is "+chg_clsf );
}
String aset_no_fr = req.getParameter("aset_no_fr");
if( aset_no_fr == null){
	System.out.println(this.toString+" : aset_no_fr is null" );
}else{
	System.out.println(this.toString+" : aset_no_fr is "+aset_no_fr );
}
String aset_no_to = req.getParameter("aset_no_to");
if( aset_no_to == null){
	System.out.println(this.toString+" : aset_no_to is null" );
}else{
	System.out.println(this.toString+" : aset_no_to is "+aset_no_to );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chg_dt_fr = Util.checkString(req.getParameter("chg_dt_fr"));
String chg_dt_to = Util.checkString(req.getParameter("chg_dt_to"));
String chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
String aset_no_fr = Util.checkString(req.getParameter("aset_no_fr"));
String aset_no_to = Util.checkString(req.getParameter("aset_no_to"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_fr")));
String chg_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_to")));
String chg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_clsf")));
String aset_no_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_fr")));
String aset_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_to")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_dt_fr(chg_dt_fr);
dm.setChg_dt_to(chg_dt_to);
dm.setChg_clsf(chg_clsf);
dm.setAset_no_fr(aset_no_fr);
dm.setAset_no_to(aset_no_to);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 04 17:48:31 KST 2014 */