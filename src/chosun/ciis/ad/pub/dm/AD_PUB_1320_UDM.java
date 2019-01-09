/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.pub.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_PUB_1320_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String seq;
	public String chg_pers;
	public String mode;
	public String pubc_dt;
	public String guid_aprv_yn;
	public String advt_cont;
	public String advcs_cd;
	public String advcs_nm;
	public String eps_clsf_cd;
	public String pubc_side;
	public String arow;
	public String uprc;
	public String advt_fee;
	public String vat;
	public String guid_sec_kind_cd;

	public AD_PUB_1320_UDM(){}
	public AD_PUB_1320_UDM(String cmpy_cd, String medi_cd, String seq, String chg_pers, String mode, String pubc_dt, String guid_aprv_yn, String advt_cont, String advcs_cd, String advcs_nm, String eps_clsf_cd, String pubc_side, String arow, String uprc, String advt_fee, String vat, String guid_sec_kind_cd){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.seq = seq;
		this.chg_pers = chg_pers;
		this.mode = mode;
		this.pubc_dt = pubc_dt;
		this.guid_aprv_yn = guid_aprv_yn;
		this.advt_cont = advt_cont;
		this.advcs_cd = advcs_cd;
		this.advcs_nm = advcs_nm;
		this.eps_clsf_cd = eps_clsf_cd;
		this.pubc_side = pubc_side;
		this.arow = arow;
		this.uprc = uprc;
		this.advt_fee = advt_fee;
		this.vat = vat;
		this.guid_sec_kind_cd = guid_sec_kind_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setGuid_aprv_yn(String guid_aprv_yn){
		this.guid_aprv_yn = guid_aprv_yn;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setEps_clsf_cd(String eps_clsf_cd){
		this.eps_clsf_cd = eps_clsf_cd;
	}

	public void setPubc_side(String pubc_side){
		this.pubc_side = pubc_side;
	}

	public void setArow(String arow){
		this.arow = arow;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setGuid_sec_kind_cd(String guid_sec_kind_cd){
		this.guid_sec_kind_cd = guid_sec_kind_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getGuid_aprv_yn(){
		return this.guid_aprv_yn;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getEps_clsf_cd(){
		return this.eps_clsf_cd;
	}

	public String getPubc_side(){
		return this.pubc_side;
	}

	public String getArow(){
		return this.arow;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getGuid_sec_kind_cd(){
		return this.guid_sec_kind_cd;
	}

	public String getSQL(){
		 return "{ call SP_AD_PUB_1320_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1320_UDM dm = (AD_PUB_1320_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.mode);
		cstmt.setString(8, dm.pubc_dt);
		cstmt.setString(9, dm.guid_aprv_yn);
		cstmt.setString(10, dm.advt_cont);
		cstmt.setString(11, dm.advcs_cd);
		cstmt.setString(12, dm.advcs_nm);
		cstmt.setString(13, dm.eps_clsf_cd);
		cstmt.setString(14, dm.pubc_side);
		cstmt.setString(15, dm.arow);
		cstmt.setString(16, dm.uprc);
		cstmt.setString(17, dm.advt_fee);
		cstmt.setString(18, dm.vat);
		cstmt.setString(19, dm.guid_sec_kind_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1320_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("seq = " + getSeq());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("mode = " + getMode());
        System.out.println("pubc_dt = " + getPubc_dt());
        System.out.println("guid_aprv_yn = " + getGuid_aprv_yn());
        System.out.println("advt_cont = " + getAdvt_cont());
        System.out.println("advcs_cd = " + getAdvcs_cd());
        System.out.println("advcs_nm = " + getAdvcs_nm());
        System.out.println("eps_clsf_cd = " + getEps_clsf_cd());
        System.out.println("pubc_side = " + getPubc_side());
        System.out.println("arow = " + getArow());
        System.out.println("uprc = " + getUprc());
        System.out.println("advt_fee = " + getAdvt_fee());
        System.out.println("vat = " + getVat());
        System.out.println("guid_sec_kind_cd = " + getGuid_sec_kind_cd());
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String guid_aprv_yn = req.getParameter("guid_aprv_yn");
if( guid_aprv_yn == null){
	System.out.println(this.toString+" : guid_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : guid_aprv_yn is "+guid_aprv_yn );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String advcs_cd = req.getParameter("advcs_cd");
if( advcs_cd == null){
	System.out.println(this.toString+" : advcs_cd is null" );
}else{
	System.out.println(this.toString+" : advcs_cd is "+advcs_cd );
}
String advcs_nm = req.getParameter("advcs_nm");
if( advcs_nm == null){
	System.out.println(this.toString+" : advcs_nm is null" );
}else{
	System.out.println(this.toString+" : advcs_nm is "+advcs_nm );
}
String eps_clsf_cd = req.getParameter("eps_clsf_cd");
if( eps_clsf_cd == null){
	System.out.println(this.toString+" : eps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : eps_clsf_cd is "+eps_clsf_cd );
}
String pubc_side = req.getParameter("pubc_side");
if( pubc_side == null){
	System.out.println(this.toString+" : pubc_side is null" );
}else{
	System.out.println(this.toString+" : pubc_side is "+pubc_side );
}
String arow = req.getParameter("arow");
if( arow == null){
	System.out.println(this.toString+" : arow is null" );
}else{
	System.out.println(this.toString+" : arow is "+arow );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
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
String guid_sec_kind_cd = req.getParameter("guid_sec_kind_cd");
if( guid_sec_kind_cd == null){
	System.out.println(this.toString+" : guid_sec_kind_cd is null" );
}else{
	System.out.println(this.toString+" : guid_sec_kind_cd is "+guid_sec_kind_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String guid_aprv_yn = Util.checkString(req.getParameter("guid_aprv_yn"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String advcs_cd = Util.checkString(req.getParameter("advcs_cd"));
String advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
String eps_clsf_cd = Util.checkString(req.getParameter("eps_clsf_cd"));
String pubc_side = Util.checkString(req.getParameter("pubc_side"));
String arow = Util.checkString(req.getParameter("arow"));
String uprc = Util.checkString(req.getParameter("uprc"));
String advt_fee = Util.checkString(req.getParameter("advt_fee"));
String vat = Util.checkString(req.getParameter("vat"));
String guid_sec_kind_cd = Util.checkString(req.getParameter("guid_sec_kind_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String guid_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("guid_aprv_yn")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String advcs_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_cd")));
String advcs_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_nm")));
String eps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_clsf_cd")));
String pubc_side = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side")));
String arow = Util.Uni2Ksc(Util.checkString(req.getParameter("arow")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String advt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_fee")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String guid_sec_kind_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("guid_sec_kind_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setSeq(seq);
dm.setChg_pers(chg_pers);
dm.setMode(mode);
dm.setPubc_dt(pubc_dt);
dm.setGuid_aprv_yn(guid_aprv_yn);
dm.setAdvt_cont(advt_cont);
dm.setAdvcs_cd(advcs_cd);
dm.setAdvcs_nm(advcs_nm);
dm.setEps_clsf_cd(eps_clsf_cd);
dm.setPubc_side(pubc_side);
dm.setArow(arow);
dm.setUprc(uprc);
dm.setAdvt_fee(advt_fee);
dm.setVat(vat);
dm.setGuid_sec_kind_cd(guid_sec_kind_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 09:20:34 KST 2009 */