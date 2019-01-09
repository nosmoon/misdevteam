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


package chosun.ciis.is.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.snd.ds.*;
import chosun.ciis.is.snd.rec.*;

/**
 * 
 */


public class IS_SND_1530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String snd_tel;
	public String chk_000;
	public String ptph_no_000;
	public String chk_010;
	public String ptph_no_010;
	public String chk_020;
	public String ptph_no_020;
	public String msg;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_SND_1530_ADM(){}
	public IS_SND_1530_ADM(String cmpy_cd, String snd_tel, String chk_000, String ptph_no_000, String chk_010, String ptph_no_010, String chk_020, String ptph_no_020, String msg, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.snd_tel = snd_tel;
		this.chk_000 = chk_000;
		this.ptph_no_000 = ptph_no_000;
		this.chk_010 = chk_010;
		this.ptph_no_010 = ptph_no_010;
		this.chk_020 = chk_020;
		this.ptph_no_020 = ptph_no_020;
		this.msg = msg;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSnd_tel(String snd_tel){
		this.snd_tel = snd_tel;
	}

	public void setChk_000(String chk_000){
		this.chk_000 = chk_000;
	}

	public void setPtph_no_000(String ptph_no_000){
		this.ptph_no_000 = ptph_no_000;
	}

	public void setChk_010(String chk_010){
		this.chk_010 = chk_010;
	}

	public void setPtph_no_010(String ptph_no_010){
		this.ptph_no_010 = ptph_no_010;
	}

	public void setChk_020(String chk_020){
		this.chk_020 = chk_020;
	}

	public void setPtph_no_020(String ptph_no_020){
		this.ptph_no_020 = ptph_no_020;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSnd_tel(){
		return this.snd_tel;
	}

	public String getChk_000(){
		return this.chk_000;
	}

	public String getPtph_no_000(){
		return this.ptph_no_000;
	}

	public String getChk_010(){
		return this.chk_010;
	}

	public String getPtph_no_010(){
		return this.ptph_no_010;
	}

	public String getChk_020(){
		return this.chk_020;
	}

	public String getPtph_no_020(){
		return this.ptph_no_020;
	}

	public String getMsg(){
		return this.msg;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SND_1530_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SND_1530_ADM dm = (IS_SND_1530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.snd_tel);
		cstmt.setString(5, dm.chk_000);
		cstmt.setString(6, dm.ptph_no_000);
		cstmt.setString(7, dm.chk_010);
		cstmt.setString(8, dm.ptph_no_010);
		cstmt.setString(9, dm.chk_020);
		cstmt.setString(10, dm.ptph_no_020);
		cstmt.setString(11, dm.msg);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.snd.ds.IS_SND_1530_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("snd_tel = [" + getSnd_tel() + "]");
		System.out.println("chk_000 = [" + getChk_000() + "]");
		System.out.println("ptph_no_000 = [" + getPtph_no_000() + "]");
		System.out.println("chk_010 = [" + getChk_010() + "]");
		System.out.println("ptph_no_010 = [" + getPtph_no_010() + "]");
		System.out.println("chk_020 = [" + getChk_020() + "]");
		System.out.println("ptph_no_020 = [" + getPtph_no_020() + "]");
		System.out.println("msg = [" + getMsg() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String snd_tel = req.getParameter("snd_tel");
if( snd_tel == null){
	System.out.println(this.toString+" : snd_tel is null" );
}else{
	System.out.println(this.toString+" : snd_tel is "+snd_tel );
}
String chk_000 = req.getParameter("chk_000");
if( chk_000 == null){
	System.out.println(this.toString+" : chk_000 is null" );
}else{
	System.out.println(this.toString+" : chk_000 is "+chk_000 );
}
String ptph_no_000 = req.getParameter("ptph_no_000");
if( ptph_no_000 == null){
	System.out.println(this.toString+" : ptph_no_000 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_000 is "+ptph_no_000 );
}
String chk_010 = req.getParameter("chk_010");
if( chk_010 == null){
	System.out.println(this.toString+" : chk_010 is null" );
}else{
	System.out.println(this.toString+" : chk_010 is "+chk_010 );
}
String ptph_no_010 = req.getParameter("ptph_no_010");
if( ptph_no_010 == null){
	System.out.println(this.toString+" : ptph_no_010 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_010 is "+ptph_no_010 );
}
String chk_020 = req.getParameter("chk_020");
if( chk_020 == null){
	System.out.println(this.toString+" : chk_020 is null" );
}else{
	System.out.println(this.toString+" : chk_020 is "+chk_020 );
}
String ptph_no_020 = req.getParameter("ptph_no_020");
if( ptph_no_020 == null){
	System.out.println(this.toString+" : ptph_no_020 is null" );
}else{
	System.out.println(this.toString+" : ptph_no_020 is "+ptph_no_020 );
}
String msg = req.getParameter("msg");
if( msg == null){
	System.out.println(this.toString+" : msg is null" );
}else{
	System.out.println(this.toString+" : msg is "+msg );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String snd_tel = Util.checkString(req.getParameter("snd_tel"));
String chk_000 = Util.checkString(req.getParameter("chk_000"));
String ptph_no_000 = Util.checkString(req.getParameter("ptph_no_000"));
String chk_010 = Util.checkString(req.getParameter("chk_010"));
String ptph_no_010 = Util.checkString(req.getParameter("ptph_no_010"));
String chk_020 = Util.checkString(req.getParameter("chk_020"));
String ptph_no_020 = Util.checkString(req.getParameter("ptph_no_020"));
String msg = Util.checkString(req.getParameter("msg"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String snd_tel = Util.Uni2Ksc(Util.checkString(req.getParameter("snd_tel")));
String chk_000 = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_000")));
String ptph_no_000 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_000")));
String chk_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_010")));
String ptph_no_010 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_010")));
String chk_020 = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_020")));
String ptph_no_020 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no_020")));
String msg = Util.Uni2Ksc(Util.checkString(req.getParameter("msg")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSnd_tel(snd_tel);
dm.setChk_000(chk_000);
dm.setPtph_no_000(ptph_no_000);
dm.setChk_010(chk_010);
dm.setPtph_no_010(ptph_no_010);
dm.setChk_020(chk_020);
dm.setPtph_no_020(ptph_no_020);
dm.setMsg(msg);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 29 09:31:18 KST 2012 */