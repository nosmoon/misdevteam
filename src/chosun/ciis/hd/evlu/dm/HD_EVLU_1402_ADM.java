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


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_1402_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_lcls_grp_cd;
	public String evlu_grp_cd;
	public String ratio_10;
	public String ratio_20;
	public String ratio_30;
	public String ratio_40;
	public String ratio_50;
	public String ratio_60;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;
	public String asst_clsf;
	public String spcl_plus_point;
	public String spcl_minus_point;

	public HD_EVLU_1402_ADM(){}
	public HD_EVLU_1402_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_lcls_grp_cd, String evlu_grp_cd, String ratio_10, String ratio_20, String ratio_30, String ratio_40, String ratio_50, String ratio_60, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag, String asst_clsf, String spcl_plus_point, String spcl_minus_point){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_lcls_grp_cd = evlu_lcls_grp_cd;
		this.evlu_grp_cd = evlu_grp_cd;
		this.ratio_10 = ratio_10;
		this.ratio_20 = ratio_20;
		this.ratio_30 = ratio_30;
		this.ratio_40 = ratio_40;
		this.ratio_50 = ratio_50;
		this.ratio_60 = ratio_60;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
		this.asst_clsf = asst_clsf;
		this.spcl_plus_point = spcl_plus_point;
		this.spcl_minus_point = spcl_minus_point;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_lcls_grp_cd(String evlu_lcls_grp_cd){
		this.evlu_lcls_grp_cd = evlu_lcls_grp_cd;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setRatio_10(String ratio_10){
		this.ratio_10 = ratio_10;
	}

	public void setRatio_20(String ratio_20){
		this.ratio_20 = ratio_20;
	}

	public void setRatio_30(String ratio_30){
		this.ratio_30 = ratio_30;
	}

	public void setRatio_40(String ratio_40){
		this.ratio_40 = ratio_40;
	}

	public void setRatio_50(String ratio_50){
		this.ratio_50 = ratio_50;
	}

	public void setRatio_60(String ratio_60){
		this.ratio_60 = ratio_60;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setAsst_clsf(String asst_clsf){
		this.asst_clsf = asst_clsf;
	}

	public void setSpcl_plus_point(String spcl_plus_point){
		this.spcl_plus_point = spcl_plus_point;
	}

	public void setSpcl_minus_point(String spcl_minus_point){
		this.spcl_minus_point = spcl_minus_point;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_lcls_grp_cd(){
		return this.evlu_lcls_grp_cd;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getRatio_10(){
		return this.ratio_10;
	}

	public String getRatio_20(){
		return this.ratio_20;
	}

	public String getRatio_30(){
		return this.ratio_30;
	}

	public String getRatio_40(){
		return this.ratio_40;
	}

	public String getRatio_50(){
		return this.ratio_50;
	}

	public String getRatio_60(){
		return this.ratio_60;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getAsst_clsf(){
		return this.asst_clsf;
	}

	public String getSpcl_plus_point(){
		return this.spcl_plus_point;
	}

	public String getSpcl_minus_point(){
		return this.spcl_minus_point;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_1402_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_1402_ADM dm = (HD_EVLU_1402_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.evlu_lcls_grp_cd);
		cstmt.setString(7, dm.evlu_grp_cd);
		cstmt.setString(8, dm.ratio_10);
		cstmt.setString(9, dm.ratio_20);
		cstmt.setString(10, dm.ratio_30);
		cstmt.setString(11, dm.ratio_40);
		cstmt.setString(12, dm.ratio_50);
		cstmt.setString(13, dm.ratio_60);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.chg_pers);
		cstmt.setString(17, dm.flag);
		cstmt.setString(18, dm.asst_clsf);
		cstmt.setString(19, dm.spcl_plus_point);
		cstmt.setString(20, dm.spcl_minus_point);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_1402_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("evlu_lcls_grp_cd = [" + getEvlu_lcls_grp_cd() + "]");
		System.out.println("evlu_grp_cd = [" + getEvlu_grp_cd() + "]");
		System.out.println("ratio_10 = [" + getRatio_10() + "]");
		System.out.println("ratio_20 = [" + getRatio_20() + "]");
		System.out.println("ratio_30 = [" + getRatio_30() + "]");
		System.out.println("ratio_40 = [" + getRatio_40() + "]");
		System.out.println("ratio_50 = [" + getRatio_50() + "]");
		System.out.println("ratio_60 = [" + getRatio_60() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("asst_clsf = [" + getAsst_clsf() + "]");
		System.out.println("spcl_plus_point = [" + getSpcl_plus_point() + "]");
		System.out.println("spcl_minus_point = [" + getSpcl_minus_point() + "]");
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String evlu_lcls_grp_cd = req.getParameter("evlu_lcls_grp_cd");
if( evlu_lcls_grp_cd == null){
	System.out.println(this.toString+" : evlu_lcls_grp_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_lcls_grp_cd is "+evlu_lcls_grp_cd );
}
String evlu_grp_cd = req.getParameter("evlu_grp_cd");
if( evlu_grp_cd == null){
	System.out.println(this.toString+" : evlu_grp_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_cd is "+evlu_grp_cd );
}
String ratio_10 = req.getParameter("ratio_10");
if( ratio_10 == null){
	System.out.println(this.toString+" : ratio_10 is null" );
}else{
	System.out.println(this.toString+" : ratio_10 is "+ratio_10 );
}
String ratio_20 = req.getParameter("ratio_20");
if( ratio_20 == null){
	System.out.println(this.toString+" : ratio_20 is null" );
}else{
	System.out.println(this.toString+" : ratio_20 is "+ratio_20 );
}
String ratio_30 = req.getParameter("ratio_30");
if( ratio_30 == null){
	System.out.println(this.toString+" : ratio_30 is null" );
}else{
	System.out.println(this.toString+" : ratio_30 is "+ratio_30 );
}
String ratio_40 = req.getParameter("ratio_40");
if( ratio_40 == null){
	System.out.println(this.toString+" : ratio_40 is null" );
}else{
	System.out.println(this.toString+" : ratio_40 is "+ratio_40 );
}
String ratio_50 = req.getParameter("ratio_50");
if( ratio_50 == null){
	System.out.println(this.toString+" : ratio_50 is null" );
}else{
	System.out.println(this.toString+" : ratio_50 is "+ratio_50 );
}
String ratio_60 = req.getParameter("ratio_60");
if( ratio_60 == null){
	System.out.println(this.toString+" : ratio_60 is null" );
}else{
	System.out.println(this.toString+" : ratio_60 is "+ratio_60 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String asst_clsf = req.getParameter("asst_clsf");
if( asst_clsf == null){
	System.out.println(this.toString+" : asst_clsf is null" );
}else{
	System.out.println(this.toString+" : asst_clsf is "+asst_clsf );
}
String spcl_plus_point = req.getParameter("spcl_plus_point");
if( spcl_plus_point == null){
	System.out.println(this.toString+" : spcl_plus_point is null" );
}else{
	System.out.println(this.toString+" : spcl_plus_point is "+spcl_plus_point );
}
String spcl_minus_point = req.getParameter("spcl_minus_point");
if( spcl_minus_point == null){
	System.out.println(this.toString+" : spcl_minus_point is null" );
}else{
	System.out.println(this.toString+" : spcl_minus_point is "+spcl_minus_point );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String evlu_lcls_grp_cd = Util.checkString(req.getParameter("evlu_lcls_grp_cd"));
String evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
String ratio_10 = Util.checkString(req.getParameter("ratio_10"));
String ratio_20 = Util.checkString(req.getParameter("ratio_20"));
String ratio_30 = Util.checkString(req.getParameter("ratio_30"));
String ratio_40 = Util.checkString(req.getParameter("ratio_40"));
String ratio_50 = Util.checkString(req.getParameter("ratio_50"));
String ratio_60 = Util.checkString(req.getParameter("ratio_60"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
String asst_clsf = Util.checkString(req.getParameter("asst_clsf"));
String spcl_plus_point = Util.checkString(req.getParameter("spcl_plus_point"));
String spcl_minus_point = Util.checkString(req.getParameter("spcl_minus_point"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_lcls_grp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_lcls_grp_cd")));
String evlu_grp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_cd")));
String ratio_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_10")));
String ratio_20 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_20")));
String ratio_30 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_30")));
String ratio_40 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_40")));
String ratio_50 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_50")));
String ratio_60 = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio_60")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String asst_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("asst_clsf")));
String spcl_plus_point = Util.Uni2Ksc(Util.checkString(req.getParameter("spcl_plus_point")));
String spcl_minus_point = Util.Uni2Ksc(Util.checkString(req.getParameter("spcl_minus_point")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEvlu_lcls_grp_cd(evlu_lcls_grp_cd);
dm.setEvlu_grp_cd(evlu_grp_cd);
dm.setRatio_10(ratio_10);
dm.setRatio_20(ratio_20);
dm.setRatio_30(ratio_30);
dm.setRatio_40(ratio_40);
dm.setRatio_50(ratio_50);
dm.setRatio_60(ratio_60);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
dm.setAsst_clsf(asst_clsf);
dm.setSpcl_plus_point(spcl_plus_point);
dm.setSpcl_minus_point(spcl_minus_point);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 19 16:52:18 KST 2018 */