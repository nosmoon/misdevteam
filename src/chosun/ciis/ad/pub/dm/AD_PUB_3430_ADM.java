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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3430_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String medi_cd;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String exct_dt;
	public String exct_seq;
	public String fee_rate;
	public String fee;
	public String fee_vat;
	public String tot_fee;
	public String exct_uprc;
	public String exct_cnt;
	public String exct_amt;
	public String cntrct_yn;
	public String podr_slip_no;
	public String easy_amt;
	public String sale_amt;

	public AD_PUB_3430_ADM(){}
	public AD_PUB_3430_ADM(String flag, String cmpy_cd, String medi_cd, String incmg_pers_ip, String incmg_pers, String exct_dt, String exct_seq, String fee_rate, String fee, String fee_vat, String tot_fee, String exct_uprc, String exct_cnt, String exct_amt, String cntrct_yn, String podr_slip_no, String easy_amt, String sale_amt){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.exct_dt = exct_dt;
		this.exct_seq = exct_seq;
		this.fee_rate = fee_rate;
		this.fee = fee;
		this.fee_vat = fee_vat;
		this.tot_fee = tot_fee;
		this.exct_uprc = exct_uprc;
		this.exct_cnt = exct_cnt;
		this.exct_amt = exct_amt;
		this.cntrct_yn = cntrct_yn;
		this.podr_slip_no = podr_slip_no;
		this.easy_amt = easy_amt;
		this.sale_amt = sale_amt;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setExct_dt(String exct_dt){
		this.exct_dt = exct_dt;
	}

	public void setExct_seq(String exct_seq){
		this.exct_seq = exct_seq;
	}

	public void setFee_rate(String fee_rate){
		this.fee_rate = fee_rate;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setFee_vat(String fee_vat){
		this.fee_vat = fee_vat;
	}

	public void setTot_fee(String tot_fee){
		this.tot_fee = tot_fee;
	}

	public void setExct_uprc(String exct_uprc){
		this.exct_uprc = exct_uprc;
	}

	public void setExct_cnt(String exct_cnt){
		this.exct_cnt = exct_cnt;
	}

	public void setExct_amt(String exct_amt){
		this.exct_amt = exct_amt;
	}

	public void setCntrct_yn(String cntrct_yn){
		this.cntrct_yn = cntrct_yn;
	}

	public void setPodr_slip_no(String podr_slip_no){
		this.podr_slip_no = podr_slip_no;
	}

	public void setEasy_amt(String easy_amt){
		this.easy_amt = easy_amt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getExct_dt(){
		return this.exct_dt;
	}

	public String getExct_seq(){
		return this.exct_seq;
	}

	public String getFee_rate(){
		return this.fee_rate;
	}

	public String getFee(){
		return this.fee;
	}

	public String getFee_vat(){
		return this.fee_vat;
	}

	public String getTot_fee(){
		return this.tot_fee;
	}

	public String getExct_uprc(){
		return this.exct_uprc;
	}

	public String getExct_cnt(){
		return this.exct_cnt;
	}

	public String getExct_amt(){
		return this.exct_amt;
	}

	public String getCntrct_yn(){
		return this.cntrct_yn;
	}

	public String getPodr_slip_no(){
		return this.podr_slip_no;
	}

	public String getEasy_amt(){
		return this.easy_amt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3430_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3430_ADM dm = (AD_PUB_3430_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.exct_dt);
		cstmt.setString(9, dm.exct_seq);
		cstmt.setString(10, dm.fee_rate);
		cstmt.setString(11, dm.fee);
		cstmt.setString(12, dm.fee_vat);
		cstmt.setString(13, dm.tot_fee);
		cstmt.setString(14, dm.exct_uprc);
		cstmt.setString(15, dm.exct_cnt);
		cstmt.setString(16, dm.exct_amt);
		cstmt.setString(17, dm.cntrct_yn);
		cstmt.setString(18, dm.podr_slip_no);
		cstmt.setString(19, dm.easy_amt);
		cstmt.setString(20, dm.sale_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3430_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("exct_dt = [" + getExct_dt() + "]");
		System.out.println("exct_seq = [" + getExct_seq() + "]");
		System.out.println("fee_rate = [" + getFee_rate() + "]");
		System.out.println("fee = [" + getFee() + "]");
		System.out.println("fee_vat = [" + getFee_vat() + "]");
		System.out.println("tot_fee = [" + getTot_fee() + "]");
		System.out.println("exct_uprc = [" + getExct_uprc() + "]");
		System.out.println("exct_cnt = [" + getExct_cnt() + "]");
		System.out.println("exct_amt = [" + getExct_amt() + "]");
		System.out.println("cntrct_yn = [" + getCntrct_yn() + "]");
		System.out.println("podr_slip_no = [" + getPodr_slip_no() + "]");
		System.out.println("easy_amt = [" + getEasy_amt() + "]");
		System.out.println("sale_amt = [" + getSale_amt() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
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
String exct_dt = req.getParameter("exct_dt");
if( exct_dt == null){
	System.out.println(this.toString+" : exct_dt is null" );
}else{
	System.out.println(this.toString+" : exct_dt is "+exct_dt );
}
String exct_seq = req.getParameter("exct_seq");
if( exct_seq == null){
	System.out.println(this.toString+" : exct_seq is null" );
}else{
	System.out.println(this.toString+" : exct_seq is "+exct_seq );
}
String fee_rate = req.getParameter("fee_rate");
if( fee_rate == null){
	System.out.println(this.toString+" : fee_rate is null" );
}else{
	System.out.println(this.toString+" : fee_rate is "+fee_rate );
}
String fee = req.getParameter("fee");
if( fee == null){
	System.out.println(this.toString+" : fee is null" );
}else{
	System.out.println(this.toString+" : fee is "+fee );
}
String fee_vat = req.getParameter("fee_vat");
if( fee_vat == null){
	System.out.println(this.toString+" : fee_vat is null" );
}else{
	System.out.println(this.toString+" : fee_vat is "+fee_vat );
}
String tot_fee = req.getParameter("tot_fee");
if( tot_fee == null){
	System.out.println(this.toString+" : tot_fee is null" );
}else{
	System.out.println(this.toString+" : tot_fee is "+tot_fee );
}
String exct_uprc = req.getParameter("exct_uprc");
if( exct_uprc == null){
	System.out.println(this.toString+" : exct_uprc is null" );
}else{
	System.out.println(this.toString+" : exct_uprc is "+exct_uprc );
}
String exct_cnt = req.getParameter("exct_cnt");
if( exct_cnt == null){
	System.out.println(this.toString+" : exct_cnt is null" );
}else{
	System.out.println(this.toString+" : exct_cnt is "+exct_cnt );
}
String exct_amt = req.getParameter("exct_amt");
if( exct_amt == null){
	System.out.println(this.toString+" : exct_amt is null" );
}else{
	System.out.println(this.toString+" : exct_amt is "+exct_amt );
}
String cntrct_yn = req.getParameter("cntrct_yn");
if( cntrct_yn == null){
	System.out.println(this.toString+" : cntrct_yn is null" );
}else{
	System.out.println(this.toString+" : cntrct_yn is "+cntrct_yn );
}
String podr_slip_no = req.getParameter("podr_slip_no");
if( podr_slip_no == null){
	System.out.println(this.toString+" : podr_slip_no is null" );
}else{
	System.out.println(this.toString+" : podr_slip_no is "+podr_slip_no );
}
String easy_amt = req.getParameter("easy_amt");
if( easy_amt == null){
	System.out.println(this.toString+" : easy_amt is null" );
}else{
	System.out.println(this.toString+" : easy_amt is "+easy_amt );
}
String sale_amt = req.getParameter("sale_amt");
if( sale_amt == null){
	System.out.println(this.toString+" : sale_amt is null" );
}else{
	System.out.println(this.toString+" : sale_amt is "+sale_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String exct_dt = Util.checkString(req.getParameter("exct_dt"));
String exct_seq = Util.checkString(req.getParameter("exct_seq"));
String fee_rate = Util.checkString(req.getParameter("fee_rate"));
String fee = Util.checkString(req.getParameter("fee"));
String fee_vat = Util.checkString(req.getParameter("fee_vat"));
String tot_fee = Util.checkString(req.getParameter("tot_fee"));
String exct_uprc = Util.checkString(req.getParameter("exct_uprc"));
String exct_cnt = Util.checkString(req.getParameter("exct_cnt"));
String exct_amt = Util.checkString(req.getParameter("exct_amt"));
String cntrct_yn = Util.checkString(req.getParameter("cntrct_yn"));
String podr_slip_no = Util.checkString(req.getParameter("podr_slip_no"));
String easy_amt = Util.checkString(req.getParameter("easy_amt"));
String sale_amt = Util.checkString(req.getParameter("sale_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String exct_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_dt")));
String exct_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_seq")));
String fee_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_rate")));
String fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fee")));
String fee_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_vat")));
String tot_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_fee")));
String exct_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_uprc")));
String exct_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_cnt")));
String exct_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("exct_amt")));
String cntrct_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrct_yn")));
String podr_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_slip_no")));
String easy_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("easy_amt")));
String sale_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setExct_dt(exct_dt);
dm.setExct_seq(exct_seq);
dm.setFee_rate(fee_rate);
dm.setFee(fee);
dm.setFee_vat(fee_vat);
dm.setTot_fee(tot_fee);
dm.setExct_uprc(exct_uprc);
dm.setExct_cnt(exct_cnt);
dm.setExct_amt(exct_amt);
dm.setCntrct_yn(cntrct_yn);
dm.setPodr_slip_no(podr_slip_no);
dm.setEasy_amt(easy_amt);
dm.setSale_amt(sale_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 28 16:37:27 KST 2015 */