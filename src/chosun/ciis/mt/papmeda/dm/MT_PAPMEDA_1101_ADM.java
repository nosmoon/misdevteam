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


package chosun.ciis.mt.papmeda.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papmeda.ds.*;
import chosun.ciis.mt.papmeda.rec.*;

/**
 * 
 */


public class MT_PAPMEDA_1101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String fac_clsf;
	public String papcmpy_cd;
	public String medi_cd;
	public String cnsm_wgt;
	public String hdqt_paper_uprc;
	public String hdqt_amt;
	public String meda_amt;
	public String meda_vat;
	public String basi_amt;
	public String yyyymm;
	public String slip_dt;

	public MT_PAPMEDA_1101_ADM(){}
	public MT_PAPMEDA_1101_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String fac_clsf, String papcmpy_cd, String medi_cd, String cnsm_wgt, String hdqt_paper_uprc, String hdqt_amt, String meda_amt, String meda_vat, String basi_amt, String yyyymm, String slip_dt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.medi_cd = medi_cd;
		this.cnsm_wgt = cnsm_wgt;
		this.hdqt_paper_uprc = hdqt_paper_uprc;
		this.hdqt_amt = hdqt_amt;
		this.meda_amt = meda_amt;
		this.meda_vat = meda_vat;
		this.basi_amt = basi_amt;
		this.yyyymm = yyyymm;
		this.slip_dt = slip_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setCnsm_wgt(String cnsm_wgt){
		this.cnsm_wgt = cnsm_wgt;
	}

	public void setHdqt_paper_uprc(String hdqt_paper_uprc){
		this.hdqt_paper_uprc = hdqt_paper_uprc;
	}

	public void setHdqt_amt(String hdqt_amt){
		this.hdqt_amt = hdqt_amt;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setMeda_vat(String meda_vat){
		this.meda_vat = meda_vat;
	}

	public void setBasi_amt(String basi_amt){
		this.basi_amt = basi_amt;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setSlip_dt(String slip_dt){
		this.slip_dt = slip_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getCnsm_wgt(){
		return this.cnsm_wgt;
	}

	public String getHdqt_paper_uprc(){
		return this.hdqt_paper_uprc;
	}

	public String getHdqt_amt(){
		return this.hdqt_amt;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getMeda_vat(){
		return this.meda_vat;
	}

	public String getBasi_amt(){
		return this.basi_amt;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getSlip_dt(){
		return this.slip_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPMEDA_1101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPMEDA_1101_ADM dm = (MT_PAPMEDA_1101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.papcmpy_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.cnsm_wgt);
		cstmt.setString(10, dm.hdqt_paper_uprc);
		cstmt.setString(11, dm.hdqt_amt);
		cstmt.setString(12, dm.meda_amt);
		cstmt.setString(13, dm.meda_vat);
		cstmt.setString(14, dm.basi_amt);
		cstmt.setString(15, dm.yyyymm);
		cstmt.setString(16, dm.slip_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papmeda.ds.MT_PAPMEDA_1101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("cnsm_wgt = [" + getCnsm_wgt() + "]");
		System.out.println("hdqt_paper_uprc = [" + getHdqt_paper_uprc() + "]");
		System.out.println("hdqt_amt = [" + getHdqt_amt() + "]");
		System.out.println("meda_amt = [" + getMeda_amt() + "]");
		System.out.println("meda_vat = [" + getMeda_vat() + "]");
		System.out.println("basi_amt = [" + getBasi_amt() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("slip_dt = [" + getSlip_dt() + "]");
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
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String cnsm_wgt = req.getParameter("cnsm_wgt");
if( cnsm_wgt == null){
	System.out.println(this.toString+" : cnsm_wgt is null" );
}else{
	System.out.println(this.toString+" : cnsm_wgt is "+cnsm_wgt );
}
String hdqt_paper_uprc = req.getParameter("hdqt_paper_uprc");
if( hdqt_paper_uprc == null){
	System.out.println(this.toString+" : hdqt_paper_uprc is null" );
}else{
	System.out.println(this.toString+" : hdqt_paper_uprc is "+hdqt_paper_uprc );
}
String hdqt_amt = req.getParameter("hdqt_amt");
if( hdqt_amt == null){
	System.out.println(this.toString+" : hdqt_amt is null" );
}else{
	System.out.println(this.toString+" : hdqt_amt is "+hdqt_amt );
}
String meda_amt = req.getParameter("meda_amt");
if( meda_amt == null){
	System.out.println(this.toString+" : meda_amt is null" );
}else{
	System.out.println(this.toString+" : meda_amt is "+meda_amt );
}
String meda_vat = req.getParameter("meda_vat");
if( meda_vat == null){
	System.out.println(this.toString+" : meda_vat is null" );
}else{
	System.out.println(this.toString+" : meda_vat is "+meda_vat );
}
String basi_amt = req.getParameter("basi_amt");
if( basi_amt == null){
	System.out.println(this.toString+" : basi_amt is null" );
}else{
	System.out.println(this.toString+" : basi_amt is "+basi_amt );
}
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String slip_dt = req.getParameter("slip_dt");
if( slip_dt == null){
	System.out.println(this.toString+" : slip_dt is null" );
}else{
	System.out.println(this.toString+" : slip_dt is "+slip_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String cnsm_wgt = Util.checkString(req.getParameter("cnsm_wgt"));
String hdqt_paper_uprc = Util.checkString(req.getParameter("hdqt_paper_uprc"));
String hdqt_amt = Util.checkString(req.getParameter("hdqt_amt"));
String meda_amt = Util.checkString(req.getParameter("meda_amt"));
String meda_vat = Util.checkString(req.getParameter("meda_vat"));
String basi_amt = Util.checkString(req.getParameter("basi_amt"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String slip_dt = Util.checkString(req.getParameter("slip_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String cnsm_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnsm_wgt")));
String hdqt_paper_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_paper_uprc")));
String hdqt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hdqt_amt")));
String meda_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_amt")));
String meda_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_vat")));
String basi_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_amt")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String slip_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setCnsm_wgt(cnsm_wgt);
dm.setHdqt_paper_uprc(hdqt_paper_uprc);
dm.setHdqt_amt(hdqt_amt);
dm.setMeda_amt(meda_amt);
dm.setMeda_vat(meda_vat);
dm.setBasi_amt(basi_amt);
dm.setYyyymm(yyyymm);
dm.setSlip_dt(slip_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 03 01:51:39 KST 2009 */