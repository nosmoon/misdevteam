/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String pubc_slip_no;
	public String advt_fee;
	public String vat;
	public String unpaid_amt;
	public String hndl_clsf;
	public String dlco_no;
	public String agn;
	public String hndl_plac_cd;
	public String bddb_proc_clsf;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_1320_ADM(){}
	public AD_DEP_1320_ADM(String flag, String cmpy_cd, String pubc_slip_no, String advt_fee, String vat, String unpaid_amt, String hndl_clsf, String dlco_no, String agn, String hndl_plac_cd, String bddb_proc_clsf, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.pubc_slip_no = pubc_slip_no;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.unpaid_amt = unpaid_amt;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.agn = agn;
		this.hndl_plac_cd = hndl_plac_cd;
		this.bddb_proc_clsf = bddb_proc_clsf;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setUnpaid_amt(String unpaid_amt){
		this.unpaid_amt = unpaid_amt;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setAgn(String agn){
		this.agn = agn;
	}

	public void setHndl_plac_cd(String hndl_plac_cd){
		this.hndl_plac_cd = hndl_plac_cd;
	}

	public void setBddb_proc_clsf(String bddb_proc_clsf){
		this.bddb_proc_clsf = bddb_proc_clsf;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getUnpaid_amt(){
		return this.unpaid_amt;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getAgn(){
		return this.agn;
	}

	public String getHndl_plac_cd(){
		return this.hndl_plac_cd;
	}

	public String getBddb_proc_clsf(){
		return this.bddb_proc_clsf;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_DEP_1320_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1320_ADM dm = (AD_DEP_1320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.pubc_slip_no);
		cstmt.setString(6, dm.advt_fee);
		cstmt.setString(7, dm.vat);
		cstmt.setString(8, dm.unpaid_amt);
		cstmt.setString(9, dm.hndl_clsf);
		cstmt.setString(10, dm.dlco_no);
		cstmt.setString(11, dm.agn);
		cstmt.setString(12, dm.hndl_plac_cd);
		cstmt.setString(13, dm.bddb_proc_clsf);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1320_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pubc_slip_no = " + getPubc_slip_no());
        System.out.println("advt_fee = " + getAdvt_fee());
        System.out.println("vat = " + getVat());
        System.out.println("unpaid_amt = " + getUnpaid_amt());
        System.out.println("hndl_clsf = " + getHndl_clsf());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("agn = " + getAgn());
        System.out.println("hndl_plac_cd = " + getHndl_plac_cd());
        System.out.println("bddb_proc_clsf = " + getBddb_proc_clsf());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String advt_fee = req.getParameter("advt_fee");
if( advt_fee == null){
	System.out.println(this.toString+" : advt_fee is null" );
}else{
	System.out.println(this.toString+" : advt_fee is "+advt_fee );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String unpaid_amt = req.getParameter("unpaid_amt");
if( unpaid_amt == null){
	System.out.println(this.toString+" : unpaid_amt is null" );
}else{
	System.out.println(this.toString+" : unpaid_amt is "+unpaid_amt );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String agn = req.getParameter("agn");
if( agn == null){
	System.out.println(this.toString+" : agn is null" );
}else{
	System.out.println(this.toString+" : agn is "+agn );
}
String hndl_plac_cd = req.getParameter("hndl_plac_cd");
if( hndl_plac_cd == null){
	System.out.println(this.toString+" : hndl_plac_cd is null" );
}else{
	System.out.println(this.toString+" : hndl_plac_cd is "+hndl_plac_cd );
}
String bddb_proc_clsf = req.getParameter("bddb_proc_clsf");
if( bddb_proc_clsf == null){
	System.out.println(this.toString+" : bddb_proc_clsf is null" );
}else{
	System.out.println(this.toString+" : bddb_proc_clsf is "+bddb_proc_clsf );
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

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String unpaid_amt = Util.checkString(req.getParameter("unpaid_amt"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String agn = Util.checkString(req.getParameter("agn"));
String hndl_plac_cd = Util.checkString(req.getParameter("hndl_plac_cd"));
String bddb_proc_clsf = Util.checkString(req.getParameter("bddb_proc_clsf"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String unpaid_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("unpaid_amt")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String agn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn")));
String hndl_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_plac_cd")));
String bddb_proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bddb_proc_clsf")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setPubc_slip_no(pubc_slip_no);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setUnpaid_amt(unpaid_amt);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setAgn(agn);
dm.setHndl_plac_cd(hndl_plac_cd);
dm.setBddb_proc_clsf(bddb_proc_clsf);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 19:16:36 KST 2009 */