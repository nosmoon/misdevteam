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


public class MT_COMMATR_3210_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String gubun;
	public String seq;
	public String yy;
	public String sale_amt;
	public String busn_prft;
	public String busn_prft_rate;
	public String thterm_net_prft;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String dlco_no;

	public MT_COMMATR_3210_ADM(){}
	public MT_COMMATR_3210_ADM(String cmpy_cd, String gubun, String seq, String yy, String sale_amt, String busn_prft, String busn_prft_rate, String thterm_net_prft, String incmg_pers_ipaddr, String incmg_pers, String incmg_dt_tm, String dlco_no){
		this.cmpy_cd = cmpy_cd;
		this.gubun = gubun;
		this.seq = seq;
		this.yy = yy;
		this.sale_amt = sale_amt;
		this.busn_prft = busn_prft;
		this.busn_prft_rate = busn_prft_rate;
		this.thterm_net_prft = thterm_net_prft;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.dlco_no = dlco_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setSeq(String seq){
		this.seq = seq;
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

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSeq(){
		return this.seq;
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

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_3210_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_3210_ADM dm = (MT_COMMATR_3210_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.gubun);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.yy);
		cstmt.setString(7, dm.sale_amt);
		cstmt.setString(8, dm.busn_prft);
		cstmt.setString(9, dm.busn_prft_rate);
		cstmt.setString(10, dm.thterm_net_prft);
		cstmt.setString(11, dm.incmg_pers_ipaddr);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_dt_tm);
		cstmt.setString(14, dm.dlco_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_3210_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
		System.out.println("busn_prft = [" + getBusn_prft() + "]");
		System.out.println("busn_prft_rate = [" + getBusn_prft_rate() + "]");
		System.out.println("thterm_net_prft = [" + getThterm_net_prft() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String gubun = Util.checkString(req.getParameter("gubun"));
String seq = Util.checkString(req.getParameter("seq"));
String yy = Util.checkString(req.getParameter("yy"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
String busn_prft = Util.checkString(req.getParameter("busn_prft"));
String busn_prft_rate = Util.checkString(req.getParameter("busn_prft_rate"));
String thterm_net_prft = Util.checkString(req.getParameter("thterm_net_prft"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
String busn_prft = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_prft")));
String busn_prft_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("busn_prft_rate")));
String thterm_net_prft = Util.Uni2Ksc(Util.checkString(req.getParameter("thterm_net_prft")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setGubun(gubun);
dm.setSeq(seq);
dm.setYy(yy);
dm.setSale_amt(sale_amt);
dm.setBusn_prft(busn_prft);
dm.setBusn_prft_rate(busn_prft_rate);
dm.setThterm_net_prft(thterm_net_prft);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 10:43:04 KST 2009 */