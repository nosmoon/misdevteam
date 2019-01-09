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


public class AD_BAS_2740_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_clsf;
	public String part_cd;
	public String acct_id;
	public String seq;
	public String part_posi;
	public String chrg_clsf;
	public String chrg_medi;
	public String frdt;
	public String alt_team_pers;
	public String alt_chrg_pers;
	public String todt;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String flag;

	public AD_BAS_2740_ADM(){}
	public AD_BAS_2740_ADM(String cmpy_cd, String medi_clsf, String part_cd, String acct_id, String seq, String part_posi, String chrg_clsf, String chrg_medi, String frdt, String alt_team_pers, String alt_chrg_pers, String todt, String incmg_pers_ip, String incmg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.part_cd = part_cd;
		this.acct_id = acct_id;
		this.seq = seq;
		this.part_posi = part_posi;
		this.chrg_clsf = chrg_clsf;
		this.chrg_medi = chrg_medi;
		this.frdt = frdt;
		this.alt_team_pers = alt_team_pers;
		this.alt_chrg_pers = alt_chrg_pers;
		this.todt = todt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setAcct_id(String acct_id){
		this.acct_id = acct_id;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPart_posi(String part_posi){
		this.part_posi = part_posi;
	}

	public void setChrg_clsf(String chrg_clsf){
		this.chrg_clsf = chrg_clsf;
	}

	public void setChrg_medi(String chrg_medi){
		this.chrg_medi = chrg_medi;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setAlt_team_pers(String alt_team_pers){
		this.alt_team_pers = alt_team_pers;
	}

	public void setAlt_chrg_pers(String alt_chrg_pers){
		this.alt_chrg_pers = alt_chrg_pers;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getAcct_id(){
		return this.acct_id;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPart_posi(){
		return this.part_posi;
	}

	public String getChrg_clsf(){
		return this.chrg_clsf;
	}

	public String getChrg_medi(){
		return this.chrg_medi;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getAlt_team_pers(){
		return this.alt_team_pers;
	}

	public String getAlt_chrg_pers(){
		return this.alt_chrg_pers;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_2740_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_2740_ADM dm = (AD_BAS_2740_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.part_cd);
		cstmt.setString(6, dm.acct_id);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.part_posi);
		cstmt.setString(9, dm.chrg_clsf);
		cstmt.setString(10, dm.chrg_medi);
		cstmt.setString(11, dm.frdt);
		cstmt.setString(12, dm.alt_team_pers);
		cstmt.setString(13, dm.alt_chrg_pers);
		cstmt.setString(14, dm.todt);
		cstmt.setString(15, dm.incmg_pers_ip);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_2740_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("part_cd = [" + getPart_cd() + "]");
		System.out.println("acct_id = [" + getAcct_id() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("part_posi = [" + getPart_posi() + "]");
		System.out.println("chrg_clsf = [" + getChrg_clsf() + "]");
		System.out.println("chrg_medi = [" + getChrg_medi() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("alt_team_pers = [" + getAlt_team_pers() + "]");
		System.out.println("alt_chrg_pers = [" + getAlt_chrg_pers() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String part_cd = req.getParameter("part_cd");
if( part_cd == null){
	System.out.println(this.toString+" : part_cd is null" );
}else{
	System.out.println(this.toString+" : part_cd is "+part_cd );
}
String acct_id = req.getParameter("acct_id");
if( acct_id == null){
	System.out.println(this.toString+" : acct_id is null" );
}else{
	System.out.println(this.toString+" : acct_id is "+acct_id );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String part_posi = req.getParameter("part_posi");
if( part_posi == null){
	System.out.println(this.toString+" : part_posi is null" );
}else{
	System.out.println(this.toString+" : part_posi is "+part_posi );
}
String chrg_clsf = req.getParameter("chrg_clsf");
if( chrg_clsf == null){
	System.out.println(this.toString+" : chrg_clsf is null" );
}else{
	System.out.println(this.toString+" : chrg_clsf is "+chrg_clsf );
}
String chrg_medi = req.getParameter("chrg_medi");
if( chrg_medi == null){
	System.out.println(this.toString+" : chrg_medi is null" );
}else{
	System.out.println(this.toString+" : chrg_medi is "+chrg_medi );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String alt_team_pers = req.getParameter("alt_team_pers");
if( alt_team_pers == null){
	System.out.println(this.toString+" : alt_team_pers is null" );
}else{
	System.out.println(this.toString+" : alt_team_pers is "+alt_team_pers );
}
String alt_chrg_pers = req.getParameter("alt_chrg_pers");
if( alt_chrg_pers == null){
	System.out.println(this.toString+" : alt_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : alt_chrg_pers is "+alt_chrg_pers );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
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
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String part_cd = Util.checkString(req.getParameter("part_cd"));
String acct_id = Util.checkString(req.getParameter("acct_id"));
String seq = Util.checkString(req.getParameter("seq"));
String part_posi = Util.checkString(req.getParameter("part_posi"));
String chrg_clsf = Util.checkString(req.getParameter("chrg_clsf"));
String chrg_medi = Util.checkString(req.getParameter("chrg_medi"));
String frdt = Util.checkString(req.getParameter("frdt"));
String alt_team_pers = Util.checkString(req.getParameter("alt_team_pers"));
String alt_chrg_pers = Util.checkString(req.getParameter("alt_chrg_pers"));
String todt = Util.checkString(req.getParameter("todt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String part_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd")));
String acct_id = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_id")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String part_posi = Util.Uni2Ksc(Util.checkString(req.getParameter("part_posi")));
String chrg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_clsf")));
String chrg_medi = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_medi")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String alt_team_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("alt_team_pers")));
String alt_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("alt_chrg_pers")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setPart_cd(part_cd);
dm.setAcct_id(acct_id);
dm.setSeq(seq);
dm.setPart_posi(part_posi);
dm.setChrg_clsf(chrg_clsf);
dm.setChrg_medi(chrg_medi);
dm.setFrdt(frdt);
dm.setAlt_team_pers(alt_team_pers);
dm.setAlt_chrg_pers(alt_chrg_pers);
dm.setTodt(todt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 14:59:45 KST 2009 */