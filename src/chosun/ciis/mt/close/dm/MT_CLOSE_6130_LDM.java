/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 마감관리 - 위탁인쇄현황
* 작성일자 : 2010-07-27
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.close.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.ds.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_6130_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bgn_yymm;
	public String end_yymm;
	public String base_mm;
	public String medi_cd;
	public String fac_clsf;
	public String sel_clsf;
	public String incmg_pers;

	public MT_CLOSE_6130_LDM(){}
	public MT_CLOSE_6130_LDM(String cmpy_cd, String bgn_yymm, String end_yymm, String base_mm, String medi_cd, String fac_clsf, String sel_clsf, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.bgn_yymm = bgn_yymm;
		this.end_yymm = end_yymm;
		this.base_mm = base_mm;
		this.medi_cd = medi_cd;
		this.fac_clsf = fac_clsf;
		this.sel_clsf = sel_clsf;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBgn_yymm(String bgn_yymm){
		this.bgn_yymm = bgn_yymm;
	}

	public void setEnd_yymm(String end_yymm){
		this.end_yymm = end_yymm;
	}

	public void setBase_mm(String base_mm){
		this.base_mm = base_mm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSel_clsf(String sel_clsf){
		this.sel_clsf = sel_clsf;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBgn_yymm(){
		return this.bgn_yymm;
	}

	public String getEnd_yymm(){
		return this.end_yymm;
	}

	public String getBase_mm(){
		return this.base_mm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSel_clsf(){
		return this.sel_clsf;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_MT_CLOSE_6130_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_CLOSE_6130_LDM dm = (MT_CLOSE_6130_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bgn_yymm);
		cstmt.setString(5, dm.end_yymm);
		cstmt.setString(6, dm.base_mm);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.sel_clsf);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.close.ds.MT_CLOSE_6130_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bgn_yymm = " + getBgn_yymm());
        System.out.println("end_yymm = " + getEnd_yymm());
        System.out.println("base_mm = " + getBase_mm());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("fac_clsf = " + getFac_clsf());
        System.out.println("sel_clsf = " + getSel_clsf());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String bgn_yymm = req.getParameter("bgn_yymm");
if( bgn_yymm == null){
	System.out.println(this.toString+" : bgn_yymm is null" );
}else{
	System.out.println(this.toString+" : bgn_yymm is "+bgn_yymm );
}
String end_yymm = req.getParameter("end_yymm");
if( end_yymm == null){
	System.out.println(this.toString+" : end_yymm is null" );
}else{
	System.out.println(this.toString+" : end_yymm is "+end_yymm );
}
String base_mm = req.getParameter("base_mm");
if( base_mm == null){
	System.out.println(this.toString+" : base_mm is null" );
}else{
	System.out.println(this.toString+" : base_mm is "+base_mm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String sel_clsf = req.getParameter("sel_clsf");
if( sel_clsf == null){
	System.out.println(this.toString+" : sel_clsf is null" );
}else{
	System.out.println(this.toString+" : sel_clsf is "+sel_clsf );
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
String bgn_yymm = Util.checkString(req.getParameter("bgn_yymm"));
String end_yymm = Util.checkString(req.getParameter("end_yymm"));
String base_mm = Util.checkString(req.getParameter("base_mm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String sel_clsf = Util.checkString(req.getParameter("sel_clsf"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bgn_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_yymm")));
String end_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yymm")));
String base_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("base_mm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String sel_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sel_clsf")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBgn_yymm(bgn_yymm);
dm.setEnd_yymm(end_yymm);
dm.setBase_mm(base_mm);
dm.setMedi_cd(medi_cd);
dm.setFac_clsf(fac_clsf);
dm.setSel_clsf(sel_clsf);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 27 11:39:53 KST 2010 */