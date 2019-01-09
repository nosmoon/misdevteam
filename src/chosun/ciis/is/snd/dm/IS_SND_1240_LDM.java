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


public class IS_SND_1240_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String scat_dt_fr;
	public String scat_dt_to;
	public String wh_cd;
	public String std_cd_1;
	public String bnch_qty_1;
	public String cmpy_cd_2;
	public String asnt_dstc_cd_2;
	public String cmpy_cd_3;
	public String acwr_reg_dt_3;
	public String acwr_reg_seq_3;
	public String bnch_qty_3;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_SND_1240_LDM(){}
	public IS_SND_1240_LDM(String cmpy_cd, String scat_dt_fr, String scat_dt_to, String wh_cd, String std_cd_1, String bnch_qty_1, String cmpy_cd_2, String asnt_dstc_cd_2, String cmpy_cd_3, String acwr_reg_dt_3, String acwr_reg_seq_3, String bnch_qty_3, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.scat_dt_fr = scat_dt_fr;
		this.scat_dt_to = scat_dt_to;
		this.wh_cd = wh_cd;
		this.std_cd_1 = std_cd_1;
		this.bnch_qty_1 = bnch_qty_1;
		this.cmpy_cd_2 = cmpy_cd_2;
		this.asnt_dstc_cd_2 = asnt_dstc_cd_2;
		this.cmpy_cd_3 = cmpy_cd_3;
		this.acwr_reg_dt_3 = acwr_reg_dt_3;
		this.acwr_reg_seq_3 = acwr_reg_seq_3;
		this.bnch_qty_3 = bnch_qty_3;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setScat_dt_fr(String scat_dt_fr){
		this.scat_dt_fr = scat_dt_fr;
	}

	public void setScat_dt_to(String scat_dt_to){
		this.scat_dt_to = scat_dt_to;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setStd_cd_1(String std_cd_1){
		this.std_cd_1 = std_cd_1;
	}

	public void setBnch_qty_1(String bnch_qty_1){
		this.bnch_qty_1 = bnch_qty_1;
	}

	public void setCmpy_cd_2(String cmpy_cd_2){
		this.cmpy_cd_2 = cmpy_cd_2;
	}

	public void setAsnt_dstc_cd_2(String asnt_dstc_cd_2){
		this.asnt_dstc_cd_2 = asnt_dstc_cd_2;
	}

	public void setCmpy_cd_3(String cmpy_cd_3){
		this.cmpy_cd_3 = cmpy_cd_3;
	}

	public void setAcwr_reg_dt_3(String acwr_reg_dt_3){
		this.acwr_reg_dt_3 = acwr_reg_dt_3;
	}

	public void setAcwr_reg_seq_3(String acwr_reg_seq_3){
		this.acwr_reg_seq_3 = acwr_reg_seq_3;
	}

	public void setBnch_qty_3(String bnch_qty_3){
		this.bnch_qty_3 = bnch_qty_3;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getScat_dt_fr(){
		return this.scat_dt_fr;
	}

	public String getScat_dt_to(){
		return this.scat_dt_to;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getStd_cd_1(){
		return this.std_cd_1;
	}

	public String getBnch_qty_1(){
		return this.bnch_qty_1;
	}

	public String getCmpy_cd_2(){
		return this.cmpy_cd_2;
	}

	public String getAsnt_dstc_cd_2(){
		return this.asnt_dstc_cd_2;
	}

	public String getCmpy_cd_3(){
		return this.cmpy_cd_3;
	}

	public String getAcwr_reg_dt_3(){
		return this.acwr_reg_dt_3;
	}

	public String getAcwr_reg_seq_3(){
		return this.acwr_reg_seq_3;
	}

	public String getBnch_qty_3(){
		return this.bnch_qty_3;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SND_1240_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SND_1240_LDM dm = (IS_SND_1240_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.scat_dt_fr);
		cstmt.setString(5, dm.scat_dt_to);
		cstmt.setString(6, dm.wh_cd);
		cstmt.setString(7, dm.std_cd_1);
		cstmt.setString(8, dm.bnch_qty_1);
		cstmt.setString(9, dm.cmpy_cd_2);
		cstmt.setString(10, dm.asnt_dstc_cd_2);
		cstmt.setString(11, dm.cmpy_cd_3);
		cstmt.setString(12, dm.acwr_reg_dt_3);
		cstmt.setString(13, dm.acwr_reg_seq_3);
		cstmt.setString(14, dm.bnch_qty_3);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.snd.ds.IS_SND_1240_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("scat_dt_fr = [" + getScat_dt_fr() + "]");
		System.out.println("scat_dt_to = [" + getScat_dt_to() + "]");
		System.out.println("wh_cd = [" + getWh_cd() + "]");
		System.out.println("std_cd_1 = [" + getStd_cd_1() + "]");
		System.out.println("bnch_qty_1 = [" + getBnch_qty_1() + "]");
		System.out.println("cmpy_cd_2 = [" + getCmpy_cd_2() + "]");
		System.out.println("asnt_dstc_cd_2 = [" + getAsnt_dstc_cd_2() + "]");
		System.out.println("cmpy_cd_3 = [" + getCmpy_cd_3() + "]");
		System.out.println("acwr_reg_dt_3 = [" + getAcwr_reg_dt_3() + "]");
		System.out.println("acwr_reg_seq_3 = [" + getAcwr_reg_seq_3() + "]");
		System.out.println("bnch_qty_3 = [" + getBnch_qty_3() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String scat_dt_fr = req.getParameter("scat_dt_fr");
if( scat_dt_fr == null){
	System.out.println(this.toString+" : scat_dt_fr is null" );
}else{
	System.out.println(this.toString+" : scat_dt_fr is "+scat_dt_fr );
}
String scat_dt_to = req.getParameter("scat_dt_to");
if( scat_dt_to == null){
	System.out.println(this.toString+" : scat_dt_to is null" );
}else{
	System.out.println(this.toString+" : scat_dt_to is "+scat_dt_to );
}
String wh_cd = req.getParameter("wh_cd");
if( wh_cd == null){
	System.out.println(this.toString+" : wh_cd is null" );
}else{
	System.out.println(this.toString+" : wh_cd is "+wh_cd );
}
String std_cd_1 = req.getParameter("std_cd_1");
if( std_cd_1 == null){
	System.out.println(this.toString+" : std_cd_1 is null" );
}else{
	System.out.println(this.toString+" : std_cd_1 is "+std_cd_1 );
}
String bnch_qty_1 = req.getParameter("bnch_qty_1");
if( bnch_qty_1 == null){
	System.out.println(this.toString+" : bnch_qty_1 is null" );
}else{
	System.out.println(this.toString+" : bnch_qty_1 is "+bnch_qty_1 );
}
String cmpy_cd_2 = req.getParameter("cmpy_cd_2");
if( cmpy_cd_2 == null){
	System.out.println(this.toString+" : cmpy_cd_2 is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd_2 is "+cmpy_cd_2 );
}
String asnt_dstc_cd_2 = req.getParameter("asnt_dstc_cd_2");
if( asnt_dstc_cd_2 == null){
	System.out.println(this.toString+" : asnt_dstc_cd_2 is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd_2 is "+asnt_dstc_cd_2 );
}
String cmpy_cd_3 = req.getParameter("cmpy_cd_3");
if( cmpy_cd_3 == null){
	System.out.println(this.toString+" : cmpy_cd_3 is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd_3 is "+cmpy_cd_3 );
}
String acwr_reg_dt_3 = req.getParameter("acwr_reg_dt_3");
if( acwr_reg_dt_3 == null){
	System.out.println(this.toString+" : acwr_reg_dt_3 is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_dt_3 is "+acwr_reg_dt_3 );
}
String acwr_reg_seq_3 = req.getParameter("acwr_reg_seq_3");
if( acwr_reg_seq_3 == null){
	System.out.println(this.toString+" : acwr_reg_seq_3 is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_seq_3 is "+acwr_reg_seq_3 );
}
String bnch_qty_3 = req.getParameter("bnch_qty_3");
if( bnch_qty_3 == null){
	System.out.println(this.toString+" : bnch_qty_3 is null" );
}else{
	System.out.println(this.toString+" : bnch_qty_3 is "+bnch_qty_3 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String scat_dt_fr = Util.checkString(req.getParameter("scat_dt_fr"));
String scat_dt_to = Util.checkString(req.getParameter("scat_dt_to"));
String wh_cd = Util.checkString(req.getParameter("wh_cd"));
String std_cd_1 = Util.checkString(req.getParameter("std_cd_1"));
String bnch_qty_1 = Util.checkString(req.getParameter("bnch_qty_1"));
String cmpy_cd_2 = Util.checkString(req.getParameter("cmpy_cd_2"));
String asnt_dstc_cd_2 = Util.checkString(req.getParameter("asnt_dstc_cd_2"));
String cmpy_cd_3 = Util.checkString(req.getParameter("cmpy_cd_3"));
String acwr_reg_dt_3 = Util.checkString(req.getParameter("acwr_reg_dt_3"));
String acwr_reg_seq_3 = Util.checkString(req.getParameter("acwr_reg_seq_3"));
String bnch_qty_3 = Util.checkString(req.getParameter("bnch_qty_3"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String scat_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_fr")));
String scat_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("scat_dt_to")));
String wh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("wh_cd")));
String std_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd_1")));
String bnch_qty_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bnch_qty_1")));
String cmpy_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd_2")));
String asnt_dstc_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd_2")));
String cmpy_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd_3")));
String acwr_reg_dt_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt_3")));
String acwr_reg_seq_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq_3")));
String bnch_qty_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("bnch_qty_3")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setScat_dt_fr(scat_dt_fr);
dm.setScat_dt_to(scat_dt_to);
dm.setWh_cd(wh_cd);
dm.setStd_cd_1(std_cd_1);
dm.setBnch_qty_1(bnch_qty_1);
dm.setCmpy_cd_2(cmpy_cd_2);
dm.setAsnt_dstc_cd_2(asnt_dstc_cd_2);
dm.setCmpy_cd_3(cmpy_cd_3);
dm.setAcwr_reg_dt_3(acwr_reg_dt_3);
dm.setAcwr_reg_seq_3(acwr_reg_seq_3);
dm.setBnch_qty_3(bnch_qty_3);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 11 10:29:40 KST 2013 */