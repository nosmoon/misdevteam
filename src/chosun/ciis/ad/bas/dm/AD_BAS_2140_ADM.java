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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_BAS_2140_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String mode;
	public String cmpy_cd;
	public String dlco_no;
	public String medi_clsf;
	public String prfl_no;
	public String cust_mang_item;
	public String seq;
	public String send_dt;
	public String remk;
	public String incmg_pers;
	public String chg_pers;

	public AD_BAS_2140_ADM(){}
	public AD_BAS_2140_ADM(String flag, String mode, String cmpy_cd, String dlco_no, String medi_clsf, String prfl_no, String cust_mang_item, String seq, String send_dt, String remk, String incmg_pers, String chg_pers){
		this.flag = flag;
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.medi_clsf = medi_clsf;
		this.prfl_no = prfl_no;
		this.cust_mang_item = cust_mang_item;
		this.seq = seq;
		this.send_dt = send_dt;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setPrfl_no(String prfl_no){
		this.prfl_no = prfl_no;
	}

	public void setCust_mang_item(String cust_mang_item){
		this.cust_mang_item = cust_mang_item;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSend_dt(String send_dt){
		this.send_dt = send_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getPrfl_no(){
		return this.prfl_no;
	}

	public String getCust_mang_item(){
		return this.cust_mang_item;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSend_dt(){
		return this.send_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_BAS_2140_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2140_ADM dm = (AD_BAS_2140_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.medi_clsf);
		cstmt.setString(8, dm.prfl_no);
		cstmt.setString(9, dm.cust_mang_item);
		cstmt.setString(10, dm.seq);
		cstmt.setString(11, dm.send_dt);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2140_ADataSet();
	}



    public void print(){
        System.out.println("flag = " + getFlag());
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("medi_clsf = " + getMedi_clsf());
        System.out.println("prfl_no = " + getPrfl_no());
        System.out.println("cust_mang_item = " + getCust_mang_item());
        System.out.println("seq = " + getSeq());
        System.out.println("send_dt = " + getSend_dt());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String prfl_no = req.getParameter("prfl_no");
if( prfl_no == null){
	System.out.println(this.toString+" : prfl_no is null" );
}else{
	System.out.println(this.toString+" : prfl_no is "+prfl_no );
}
String cust_mang_item = req.getParameter("cust_mang_item");
if( cust_mang_item == null){
	System.out.println(this.toString+" : cust_mang_item is null" );
}else{
	System.out.println(this.toString+" : cust_mang_item is "+cust_mang_item );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String send_dt = req.getParameter("send_dt");
if( send_dt == null){
	System.out.println(this.toString+" : send_dt is null" );
}else{
	System.out.println(this.toString+" : send_dt is "+send_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String prfl_no = Util.checkString(req.getParameter("prfl_no"));
String cust_mang_item = Util.checkString(req.getParameter("cust_mang_item"));
String seq = Util.checkString(req.getParameter("seq"));
String send_dt = Util.checkString(req.getParameter("send_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String prfl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("prfl_no")));
String cust_mang_item = Util.Uni2Ksc(Util.checkString(req.getParameter("cust_mang_item")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String send_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setMedi_clsf(medi_clsf);
dm.setPrfl_no(prfl_no);
dm.setCust_mang_item(cust_mang_item);
dm.setSeq(seq);
dm.setSend_dt(send_dt);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 21 14:27:17 KST 2009 */