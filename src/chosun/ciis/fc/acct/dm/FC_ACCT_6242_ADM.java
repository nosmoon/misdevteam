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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6242_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String cmpy_cd;
	public String erplace_cd;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String sub_flag_ary;
	public String seq;
	public String vat_aset_clsf;
	public String acqr_dt;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String ern;
	public String item;
	public String suply_amt;
	public String vat_amt;
	public String qunt;

	public FC_ACCT_6242_ADM(){}
	public FC_ACCT_6242_ADM(String flag, String incmg_pers, String incmg_pers_ipadd, String cmpy_cd, String erplace_cd, String vat_fr_yymm, String vat_to_yymm, String sub_flag_ary, String seq, String vat_aset_clsf, String acqr_dt, String intg_dlco_cd, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String ern, String item, String suply_amt, String vat_amt, String qunt){
		this.flag = flag;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.cmpy_cd = cmpy_cd;
		this.erplace_cd = erplace_cd;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.sub_flag_ary = sub_flag_ary;
		this.seq = seq;
		this.vat_aset_clsf = vat_aset_clsf;
		this.acqr_dt = acqr_dt;
		this.intg_dlco_cd = intg_dlco_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.item = item;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.qunt = qunt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setSub_flag_ary(String sub_flag_ary){
		this.sub_flag_ary = sub_flag_ary;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setVat_aset_clsf(String vat_aset_clsf){
		this.vat_aset_clsf = vat_aset_clsf;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getSub_flag_ary(){
		return this.sub_flag_ary;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getVat_aset_clsf(){
		return this.vat_aset_clsf;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getItem(){
		return this.item;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6242_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6242_ADM dm = (FC_ACCT_6242_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.cmpy_cd);
		cstmt.setString(7, dm.erplace_cd);
		cstmt.setString(8, dm.vat_fr_yymm);
		cstmt.setString(9, dm.vat_to_yymm);
		cstmt.setString(10, dm.sub_flag_ary);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.vat_aset_clsf);
		cstmt.setString(13, dm.acqr_dt);
		cstmt.setString(14, dm.intg_dlco_cd);
		cstmt.setString(15, dm.dlco_clsf_cd);
		cstmt.setString(16, dm.dlco_cd);
		cstmt.setString(17, dm.dlco_nm);
		cstmt.setString(18, dm.ern);
		cstmt.setString(19, dm.item);
		cstmt.setString(20, dm.suply_amt);
		cstmt.setString(21, dm.vat_amt);
		cstmt.setString(22, dm.qunt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6242_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("vat_fr_yymm = [" + getVat_fr_yymm() + "]");
		System.out.println("vat_to_yymm = [" + getVat_to_yymm() + "]");
		System.out.println("sub_flag_ary = [" + getSub_flag_ary() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("vat_aset_clsf = [" + getVat_aset_clsf() + "]");
		System.out.println("acqr_dt = [" + getAcqr_dt() + "]");
		System.out.println("intg_dlco_cd = [" + getIntg_dlco_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String vat_fr_yymm = req.getParameter("vat_fr_yymm");
if( vat_fr_yymm == null){
	System.out.println(this.toString+" : vat_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_fr_yymm is "+vat_fr_yymm );
}
String vat_to_yymm = req.getParameter("vat_to_yymm");
if( vat_to_yymm == null){
	System.out.println(this.toString+" : vat_to_yymm is null" );
}else{
	System.out.println(this.toString+" : vat_to_yymm is "+vat_to_yymm );
}
String sub_flag_ary = req.getParameter("sub_flag_ary");
if( sub_flag_ary == null){
	System.out.println(this.toString+" : sub_flag_ary is null" );
}else{
	System.out.println(this.toString+" : sub_flag_ary is "+sub_flag_ary );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String vat_aset_clsf = req.getParameter("vat_aset_clsf");
if( vat_aset_clsf == null){
	System.out.println(this.toString+" : vat_aset_clsf is null" );
}else{
	System.out.println(this.toString+" : vat_aset_clsf is "+vat_aset_clsf );
}
String acqr_dt = req.getParameter("acqr_dt");
if( acqr_dt == null){
	System.out.println(this.toString+" : acqr_dt is null" );
}else{
	System.out.println(this.toString+" : acqr_dt is "+acqr_dt );
}
String intg_dlco_cd = req.getParameter("intg_dlco_cd");
if( intg_dlco_cd == null){
	System.out.println(this.toString+" : intg_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : intg_dlco_cd is "+intg_dlco_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String vat_fr_yymm = Util.checkString(req.getParameter("vat_fr_yymm"));
String vat_to_yymm = Util.checkString(req.getParameter("vat_to_yymm"));
String sub_flag_ary = Util.checkString(req.getParameter("sub_flag_ary"));
String seq = Util.checkString(req.getParameter("seq"));
String vat_aset_clsf = Util.checkString(req.getParameter("vat_aset_clsf"));
String acqr_dt = Util.checkString(req.getParameter("acqr_dt"));
String intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String item = Util.checkString(req.getParameter("item"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String qunt = Util.checkString(req.getParameter("qunt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String vat_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_fr_yymm")));
String vat_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_to_yymm")));
String sub_flag_ary = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_flag_ary")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String vat_aset_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_aset_clsf")));
String acqr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_dt")));
String intg_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("intg_dlco_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCmpy_cd(cmpy_cd);
dm.setErplace_cd(erplace_cd);
dm.setVat_fr_yymm(vat_fr_yymm);
dm.setVat_to_yymm(vat_to_yymm);
dm.setSub_flag_ary(sub_flag_ary);
dm.setSeq(seq);
dm.setVat_aset_clsf(vat_aset_clsf);
dm.setAcqr_dt(acqr_dt);
dm.setIntg_dlco_cd(intg_dlco_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setErn(ern);
dm.setItem(item);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setQunt(qunt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jun 22 11:38:30 KST 2014 */