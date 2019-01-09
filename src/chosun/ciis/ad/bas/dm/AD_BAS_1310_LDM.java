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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String mortg_clsf;
	public String data_clsf;
	public String frdt;
	public String todt;
	public String cntr_yymm;
	public String cg_gb;
	public String dlco_no;
	public String dlco_clsf;
	public String curr_yn;
	public String prev_yn;
	public String basi_dt;
	public String over_yn;

	public AD_BAS_1310_LDM(){}
	public AD_BAS_1310_LDM(String cmpy_cd, String medi_clsf, String mortg_clsf, String data_clsf, String frdt, String todt, String cntr_yymm, String cg_gb, String dlco_no, String dlco_clsf, String curr_yn, String prev_yn, String basi_dt, String over_yn){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.mortg_clsf = mortg_clsf;
		this.data_clsf = data_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.cntr_yymm = cntr_yymm;
		this.cg_gb = cg_gb;
		this.dlco_no = dlco_no;
		this.dlco_clsf = dlco_clsf;
		this.curr_yn = curr_yn;
		this.prev_yn = prev_yn;
		this.basi_dt = basi_dt;
		this.over_yn = over_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMortg_clsf(String mortg_clsf){
		this.mortg_clsf = mortg_clsf;
	}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setCntr_yymm(String cntr_yymm){
		this.cntr_yymm = cntr_yymm;
	}

	public void setCg_gb(String cg_gb){
		this.cg_gb = cg_gb;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setCurr_yn(String curr_yn){
		this.curr_yn = curr_yn;
	}

	public void setPrev_yn(String prev_yn){
		this.prev_yn = prev_yn;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setOver_yn(String over_yn){
		this.over_yn = over_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMortg_clsf(){
		return this.mortg_clsf;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getCntr_yymm(){
		return this.cntr_yymm;
	}

	public String getCg_gb(){
		return this.cg_gb;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getCurr_yn(){
		return this.curr_yn;
	}

	public String getPrev_yn(){
		return this.prev_yn;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getOver_yn(){
		return this.over_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1310_LDM dm = (AD_BAS_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.mortg_clsf);
		cstmt.setString(6, dm.data_clsf);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.cntr_yymm);
		cstmt.setString(10, dm.cg_gb);
		cstmt.setString(11, dm.dlco_no);
		cstmt.setString(12, dm.dlco_clsf);
		cstmt.setString(13, dm.curr_yn);
		cstmt.setString(14, dm.prev_yn);
		cstmt.setString(15, dm.basi_dt);
		cstmt.setString(16, dm.over_yn);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("mortg_clsf = [" + getMortg_clsf() + "]");
		System.out.println("data_clsf = [" + getData_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("cntr_yymm = [" + getCntr_yymm() + "]");
		System.out.println("cg_gb = [" + getCg_gb() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("curr_yn = [" + getCurr_yn() + "]");
		System.out.println("prev_yn = [" + getPrev_yn() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("over_yn = [" + getOver_yn() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String mortg_clsf = req.getParameter("mortg_clsf");
if( mortg_clsf == null){
	System.out.println(this.toString+" : mortg_clsf is null" );
}else{
	System.out.println(this.toString+" : mortg_clsf is "+mortg_clsf );
}
String data_clsf = req.getParameter("data_clsf");
if( data_clsf == null){
	System.out.println(this.toString+" : data_clsf is null" );
}else{
	System.out.println(this.toString+" : data_clsf is "+data_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String cntr_yymm = req.getParameter("cntr_yymm");
if( cntr_yymm == null){
	System.out.println(this.toString+" : cntr_yymm is null" );
}else{
	System.out.println(this.toString+" : cntr_yymm is "+cntr_yymm );
}
String cg_gb = req.getParameter("cg_gb");
if( cg_gb == null){
	System.out.println(this.toString+" : cg_gb is null" );
}else{
	System.out.println(this.toString+" : cg_gb is "+cg_gb );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String curr_yn = req.getParameter("curr_yn");
if( curr_yn == null){
	System.out.println(this.toString+" : curr_yn is null" );
}else{
	System.out.println(this.toString+" : curr_yn is "+curr_yn );
}
String prev_yn = req.getParameter("prev_yn");
if( prev_yn == null){
	System.out.println(this.toString+" : prev_yn is null" );
}else{
	System.out.println(this.toString+" : prev_yn is "+prev_yn );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String over_yn = req.getParameter("over_yn");
if( over_yn == null){
	System.out.println(this.toString+" : over_yn is null" );
}else{
	System.out.println(this.toString+" : over_yn is "+over_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String mortg_clsf = Util.checkString(req.getParameter("mortg_clsf"));
String data_clsf = Util.checkString(req.getParameter("data_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String cntr_yymm = Util.checkString(req.getParameter("cntr_yymm"));
String cg_gb = Util.checkString(req.getParameter("cg_gb"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String curr_yn = Util.checkString(req.getParameter("curr_yn"));
String prev_yn = Util.checkString(req.getParameter("prev_yn"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String over_yn = Util.checkString(req.getParameter("over_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String mortg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mortg_clsf")));
String data_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("data_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String cntr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yymm")));
String cg_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("cg_gb")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String curr_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("curr_yn")));
String prev_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("prev_yn")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String over_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("over_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setMortg_clsf(mortg_clsf);
dm.setData_clsf(data_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setCntr_yymm(cntr_yymm);
dm.setCg_gb(cg_gb);
dm.setDlco_no(dlco_no);
dm.setDlco_clsf(dlco_clsf);
dm.setCurr_yn(curr_yn);
dm.setPrev_yn(prev_yn);
dm.setBasi_dt(basi_dt);
dm.setOver_yn(over_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 18 17:38:23 KST 2013 */