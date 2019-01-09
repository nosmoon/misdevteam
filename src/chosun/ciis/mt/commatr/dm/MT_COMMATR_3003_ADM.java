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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_3003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String yy;
	public String sale_amt;
	public String busn_prft;
	public String busn_prft_rate;
	public String thterm_net_prft;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String cmpy_cd;
	public String dlco_no;
	public String seq;
	public String mode;
	public String medi_cd;
	public String rela_yn;

	public MT_COMMATR_3003_ADM(){}
	public MT_COMMATR_3003_ADM(String gubun, String yy, String sale_amt, String busn_prft, String busn_prft_rate, String thterm_net_prft, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String chg_pers, String chg_dt_tm, String cmpy_cd, String dlco_no, String seq, String mode, String medi_cd, String rela_yn){
		this.gubun = gubun;
		this.yy = yy;
		this.sale_amt = sale_amt;
		this.busn_prft = busn_prft;
		this.busn_prft_rate = busn_prft_rate;
		this.thterm_net_prft = thterm_net_prft;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chg_pers = chg_pers;
		this.chg_dt_tm = chg_dt_tm;
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.seq = seq;
		this.mode = mode;
		this.medi_cd = medi_cd;
		this.rela_yn = rela_yn;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setBusn_prft(String busn_prft){
		this.busn_prft = busn_prft;
	}

	public void setBusn_prft_rate(String busn_prft_rate){
		this.busn_prft_rate = busn_prft_rate;
	}

	public void setThterm_net_prft(String thterm_net_prft){
		this.thterm_net_prft = thterm_net_prft;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setRela_yn(String rela_yn){
		this.rela_yn = rela_yn;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getBusn_prft(){
		return this.busn_prft;
	}

	public String getBusn_prft_rate(){
		return this.busn_prft_rate;
	}

	public String getThterm_net_prft(){
		return this.thterm_net_prft;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getRela_yn(){
		return this.rela_yn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_3003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_3003_ADM dm = (MT_COMMATR_3003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.sale_amt);
		cstmt.setString(6, dm.busn_prft);
		cstmt.setString(7, dm.busn_prft_rate);
		cstmt.setString(8, dm.thterm_net_prft);
		cstmt.setString(9, dm.incmg_pers_ipaddr);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_dt_tm);
		cstmt.setString(12, dm.chg_pers);
		cstmt.setString(13, dm.chg_dt_tm);
		cstmt.setString(14, dm.cmpy_cd);
		cstmt.setString(15, dm.dlco_no);
		cstmt.setString(16, dm.seq);
		cstmt.setString(17, dm.mode);
		cstmt.setString(18, dm.medi_cd);
		cstmt.setString(19, dm.rela_yn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_3003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
		System.out.println("busn_prft = [" + getBusn_prft() + "]");
		System.out.println("busn_prft_rate = [" + getBusn_prft_rate() + "]");
		System.out.println("thterm_net_prft = [" + getThterm_net_prft() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("chg_dt_tm = [" + getChg_dt_tm() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("rela_yn = [" + getRela_yn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
}
String busn_prft = req.getParameter("busn_prft");
if( busn_prft == null){
	System.out.println(this.toString+" : busn_prft is null" );
}else{
	System.out.println(this.toString+" : busn_prft is "+busn_prft );
}
String busn_prft_rate = req.getParameter("busn_prft_rate");
if( busn_prft_rate == null){
	System.out.println(this.toString+" : busn_prft_rate is null" );
}else{
	System.out.println(this.toString+" : busn_prft_rate is "+busn_prft_rate );
}
String thterm_net_prft = req.getParameter("thterm_net_prft");
if( thterm_net_prft == null){
	System.out.println(this.toString+" : thterm_net_prft is null" );
}else{
	System.out.println(this.toString+" : thterm_net_prft is "+thterm_net_prft );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String chg_dt_tm = req.getParameter("chg_dt_tm");
if( chg_dt_tm == null){
	System.out.println(this.toString+" : chg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : chg_dt_tm is "+chg_dt_tm );
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String rela_yn = req.getParameter("rela_yn");
if( rela_yn == null){
	System.out.println(this.toString+" : rela_yn is null" );
}else{
	System.out.println(this.toString+" : rela_yn is "+rela_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String yy = Util.checkString(req.getParameter("yy"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String busn_prft = Util.checkString(req.getParameter("busn_prft"));
String busn_prft_rate = Util.checkString(req.getParameter("busn_prft_rate"));
String thterm_net_prft = Util.checkString(req.getParameter("thterm_net_prft"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String chg_dt_tm = Util.checkString(req.getParameter("chg_dt_tm"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String seq = Util.checkString(req.getParameter("seq"));
String mode = Util.checkString(req.getParameter("mode"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String rela_yn = Util.checkString(req.getParameter("rela_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String busn_prft = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_prft")));
String busn_prft_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_prft_rate")));
String thterm_net_prft = Util.Uni2Ksc(Util.checkString(req.getParameter("thterm_net_prft")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String chg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt_tm")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String rela_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setYy(yy);
dm.setSale_amt(sale_amt);
dm.setBusn_prft(busn_prft);
dm.setBusn_prft_rate(busn_prft_rate);
dm.setThterm_net_prft(thterm_net_prft);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChg_pers(chg_pers);
dm.setChg_dt_tm(chg_dt_tm);
dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setSeq(seq);
dm.setMode(mode);
dm.setMedi_cd(medi_cd);
dm.setRela_yn(rela_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 28 16:51:50 KST 2009 */