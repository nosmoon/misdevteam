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


public class AD_BAS_3222_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String oth_clsf;
	public String pubc_dt;
	public String mode;
	public String seq;
	public String tot_pcnt;
	public String tot_clas;
	public String clr_clas;
	public String asum_pubc_amt;
	public String c0201_pcnt;
	public String c0202_pcnt;
	public String c0203_pcnt;
	public String c0204_pcnt;
	public String c0205_pcnt;
	public String c0206_pcnt;
	public String c0207_sect_nm;
	public String c0207_pcnt;
	public String c0208_sect_nm;
	public String c0208_pcnt;
	public String c0209_sect_nm;
	public String c0209_out_clsf;
	public String c0210_sect_nm;
	public String c0210_out_clsf;
	public String c0211_sect_nm;
	public String c0211_out_clsf;
	public String advt_ocpy_rate;
	public String diff_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_3222_ADM(){}
	public AD_BAS_3222_ADM(String cmpy_cd, String oth_clsf, String pubc_dt, String mode, String seq, String tot_pcnt, String tot_clas, String clr_clas, String asum_pubc_amt, String c0201_pcnt, String c0202_pcnt, String c0203_pcnt, String c0204_pcnt, String c0205_pcnt, String c0206_pcnt, String c0207_sect_nm, String c0207_pcnt, String c0208_sect_nm, String c0208_pcnt, String c0209_sect_nm, String c0209_out_clsf, String c0210_sect_nm, String c0210_out_clsf, String c0211_sect_nm, String c0211_out_clsf, String advt_ocpy_rate, String diff_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.oth_clsf = oth_clsf;
		this.pubc_dt = pubc_dt;
		this.mode = mode;
		this.seq = seq;
		this.tot_pcnt = tot_pcnt;
		this.tot_clas = tot_clas;
		this.clr_clas = clr_clas;
		this.asum_pubc_amt = asum_pubc_amt;
		this.c0201_pcnt = c0201_pcnt;
		this.c0202_pcnt = c0202_pcnt;
		this.c0203_pcnt = c0203_pcnt;
		this.c0204_pcnt = c0204_pcnt;
		this.c0205_pcnt = c0205_pcnt;
		this.c0206_pcnt = c0206_pcnt;
		this.c0207_sect_nm = c0207_sect_nm;
		this.c0207_pcnt = c0207_pcnt;
		this.c0208_sect_nm = c0208_sect_nm;
		this.c0208_pcnt = c0208_pcnt;
		this.c0209_sect_nm = c0209_sect_nm;
		this.c0209_out_clsf = c0209_out_clsf;
		this.c0210_sect_nm = c0210_sect_nm;
		this.c0210_out_clsf = c0210_out_clsf;
		this.c0211_sect_nm = c0211_sect_nm;
		this.c0211_out_clsf = c0211_out_clsf;
		this.advt_ocpy_rate = advt_ocpy_rate;
		this.diff_amt = diff_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOth_clsf(String oth_clsf){
		this.oth_clsf = oth_clsf;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTot_pcnt(String tot_pcnt){
		this.tot_pcnt = tot_pcnt;
	}

	public void setTot_clas(String tot_clas){
		this.tot_clas = tot_clas;
	}

	public void setClr_clas(String clr_clas){
		this.clr_clas = clr_clas;
	}

	public void setAsum_pubc_amt(String asum_pubc_amt){
		this.asum_pubc_amt = asum_pubc_amt;
	}

	public void setC0201_pcnt(String c0201_pcnt){
		this.c0201_pcnt = c0201_pcnt;
	}

	public void setC0202_pcnt(String c0202_pcnt){
		this.c0202_pcnt = c0202_pcnt;
	}

	public void setC0203_pcnt(String c0203_pcnt){
		this.c0203_pcnt = c0203_pcnt;
	}

	public void setC0204_pcnt(String c0204_pcnt){
		this.c0204_pcnt = c0204_pcnt;
	}

	public void setC0205_pcnt(String c0205_pcnt){
		this.c0205_pcnt = c0205_pcnt;
	}

	public void setC0206_pcnt(String c0206_pcnt){
		this.c0206_pcnt = c0206_pcnt;
	}

	public void setC0207_sect_nm(String c0207_sect_nm){
		this.c0207_sect_nm = c0207_sect_nm;
	}

	public void setC0207_pcnt(String c0207_pcnt){
		this.c0207_pcnt = c0207_pcnt;
	}

	public void setC0208_sect_nm(String c0208_sect_nm){
		this.c0208_sect_nm = c0208_sect_nm;
	}

	public void setC0208_pcnt(String c0208_pcnt){
		this.c0208_pcnt = c0208_pcnt;
	}

	public void setC0209_sect_nm(String c0209_sect_nm){
		this.c0209_sect_nm = c0209_sect_nm;
	}

	public void setC0209_out_clsf(String c0209_out_clsf){
		this.c0209_out_clsf = c0209_out_clsf;
	}

	public void setC0210_sect_nm(String c0210_sect_nm){
		this.c0210_sect_nm = c0210_sect_nm;
	}

	public void setC0210_out_clsf(String c0210_out_clsf){
		this.c0210_out_clsf = c0210_out_clsf;
	}

	public void setC0211_sect_nm(String c0211_sect_nm){
		this.c0211_sect_nm = c0211_sect_nm;
	}

	public void setC0211_out_clsf(String c0211_out_clsf){
		this.c0211_out_clsf = c0211_out_clsf;
	}

	public void setAdvt_ocpy_rate(String advt_ocpy_rate){
		this.advt_ocpy_rate = advt_ocpy_rate;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOth_clsf(){
		return this.oth_clsf;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTot_pcnt(){
		return this.tot_pcnt;
	}

	public String getTot_clas(){
		return this.tot_clas;
	}

	public String getClr_clas(){
		return this.clr_clas;
	}

	public String getAsum_pubc_amt(){
		return this.asum_pubc_amt;
	}

	public String getC0201_pcnt(){
		return this.c0201_pcnt;
	}

	public String getC0202_pcnt(){
		return this.c0202_pcnt;
	}

	public String getC0203_pcnt(){
		return this.c0203_pcnt;
	}

	public String getC0204_pcnt(){
		return this.c0204_pcnt;
	}

	public String getC0205_pcnt(){
		return this.c0205_pcnt;
	}

	public String getC0206_pcnt(){
		return this.c0206_pcnt;
	}

	public String getC0207_sect_nm(){
		return this.c0207_sect_nm;
	}

	public String getC0207_pcnt(){
		return this.c0207_pcnt;
	}

	public String getC0208_sect_nm(){
		return this.c0208_sect_nm;
	}

	public String getC0208_pcnt(){
		return this.c0208_pcnt;
	}

	public String getC0209_sect_nm(){
		return this.c0209_sect_nm;
	}

	public String getC0209_out_clsf(){
		return this.c0209_out_clsf;
	}

	public String getC0210_sect_nm(){
		return this.c0210_sect_nm;
	}

	public String getC0210_out_clsf(){
		return this.c0210_out_clsf;
	}

	public String getC0211_sect_nm(){
		return this.c0211_sect_nm;
	}

	public String getC0211_out_clsf(){
		return this.c0211_out_clsf;
	}

	public String getAdvt_ocpy_rate(){
		return this.advt_ocpy_rate;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3222_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3222_ADM dm = (AD_BAS_3222_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.oth_clsf);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.tot_pcnt);
		cstmt.setString(9, dm.tot_clas);
		cstmt.setString(10, dm.clr_clas);
		cstmt.setString(11, dm.asum_pubc_amt);
		cstmt.setString(12, dm.c0201_pcnt);
		cstmt.setString(13, dm.c0202_pcnt);
		cstmt.setString(14, dm.c0203_pcnt);
		cstmt.setString(15, dm.c0204_pcnt);
		cstmt.setString(16, dm.c0205_pcnt);
		cstmt.setString(17, dm.c0206_pcnt);
		cstmt.setString(18, dm.c0207_sect_nm);
		cstmt.setString(19, dm.c0207_pcnt);
		cstmt.setString(20, dm.c0208_sect_nm);
		cstmt.setString(21, dm.c0208_pcnt);
		cstmt.setString(22, dm.c0209_sect_nm);
		cstmt.setString(23, dm.c0209_out_clsf);
		cstmt.setString(24, dm.c0210_sect_nm);
		cstmt.setString(25, dm.c0210_out_clsf);
		cstmt.setString(26, dm.c0211_sect_nm);
		cstmt.setString(27, dm.c0211_out_clsf);
		cstmt.setString(28, dm.advt_ocpy_rate);
		cstmt.setString(29, dm.diff_amt);
		cstmt.setString(30, dm.incmg_pers_ip);
		cstmt.setString(31, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3222_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("tot_pcnt = [" + getTot_pcnt() + "]");
		System.out.println("tot_clas = [" + getTot_clas() + "]");
		System.out.println("clr_clas = [" + getClr_clas() + "]");
		System.out.println("asum_pubc_amt = [" + getAsum_pubc_amt() + "]");
		System.out.println("c0201_pcnt = [" + getC0201_pcnt() + "]");
		System.out.println("c0202_pcnt = [" + getC0202_pcnt() + "]");
		System.out.println("c0203_pcnt = [" + getC0203_pcnt() + "]");
		System.out.println("c0204_pcnt = [" + getC0204_pcnt() + "]");
		System.out.println("c0205_pcnt = [" + getC0205_pcnt() + "]");
		System.out.println("c0206_pcnt = [" + getC0206_pcnt() + "]");
		System.out.println("c0207_sect_nm = [" + getC0207_sect_nm() + "]");
		System.out.println("c0207_pcnt = [" + getC0207_pcnt() + "]");
		System.out.println("c0208_sect_nm = [" + getC0208_sect_nm() + "]");
		System.out.println("c0208_pcnt = [" + getC0208_pcnt() + "]");
		System.out.println("c0209_sect_nm = [" + getC0209_sect_nm() + "]");
		System.out.println("c0209_out_clsf = [" + getC0209_out_clsf() + "]");
		System.out.println("c0210_sect_nm = [" + getC0210_sect_nm() + "]");
		System.out.println("c0210_out_clsf = [" + getC0210_out_clsf() + "]");
		System.out.println("c0211_sect_nm = [" + getC0211_sect_nm() + "]");
		System.out.println("c0211_out_clsf = [" + getC0211_out_clsf() + "]");
		System.out.println("advt_ocpy_rate = [" + getAdvt_ocpy_rate() + "]");
		System.out.println("diff_amt = [" + getDiff_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String oth_clsf = req.getParameter("oth_clsf");
if( oth_clsf == null){
	System.out.println(this.toString+" : oth_clsf is null" );
}else{
	System.out.println(this.toString+" : oth_clsf is "+oth_clsf );
}
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String tot_pcnt = req.getParameter("tot_pcnt");
if( tot_pcnt == null){
	System.out.println(this.toString+" : tot_pcnt is null" );
}else{
	System.out.println(this.toString+" : tot_pcnt is "+tot_pcnt );
}
String tot_clas = req.getParameter("tot_clas");
if( tot_clas == null){
	System.out.println(this.toString+" : tot_clas is null" );
}else{
	System.out.println(this.toString+" : tot_clas is "+tot_clas );
}
String clr_clas = req.getParameter("clr_clas");
if( clr_clas == null){
	System.out.println(this.toString+" : clr_clas is null" );
}else{
	System.out.println(this.toString+" : clr_clas is "+clr_clas );
}
String asum_pubc_amt = req.getParameter("asum_pubc_amt");
if( asum_pubc_amt == null){
	System.out.println(this.toString+" : asum_pubc_amt is null" );
}else{
	System.out.println(this.toString+" : asum_pubc_amt is "+asum_pubc_amt );
}
String c0201_pcnt = req.getParameter("c0201_pcnt");
if( c0201_pcnt == null){
	System.out.println(this.toString+" : c0201_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0201_pcnt is "+c0201_pcnt );
}
String c0202_pcnt = req.getParameter("c0202_pcnt");
if( c0202_pcnt == null){
	System.out.println(this.toString+" : c0202_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0202_pcnt is "+c0202_pcnt );
}
String c0203_pcnt = req.getParameter("c0203_pcnt");
if( c0203_pcnt == null){
	System.out.println(this.toString+" : c0203_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0203_pcnt is "+c0203_pcnt );
}
String c0204_pcnt = req.getParameter("c0204_pcnt");
if( c0204_pcnt == null){
	System.out.println(this.toString+" : c0204_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0204_pcnt is "+c0204_pcnt );
}
String c0205_pcnt = req.getParameter("c0205_pcnt");
if( c0205_pcnt == null){
	System.out.println(this.toString+" : c0205_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0205_pcnt is "+c0205_pcnt );
}
String c0206_pcnt = req.getParameter("c0206_pcnt");
if( c0206_pcnt == null){
	System.out.println(this.toString+" : c0206_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0206_pcnt is "+c0206_pcnt );
}
String c0207_sect_nm = req.getParameter("c0207_sect_nm");
if( c0207_sect_nm == null){
	System.out.println(this.toString+" : c0207_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0207_sect_nm is "+c0207_sect_nm );
}
String c0207_pcnt = req.getParameter("c0207_pcnt");
if( c0207_pcnt == null){
	System.out.println(this.toString+" : c0207_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0207_pcnt is "+c0207_pcnt );
}
String c0208_sect_nm = req.getParameter("c0208_sect_nm");
if( c0208_sect_nm == null){
	System.out.println(this.toString+" : c0208_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0208_sect_nm is "+c0208_sect_nm );
}
String c0208_pcnt = req.getParameter("c0208_pcnt");
if( c0208_pcnt == null){
	System.out.println(this.toString+" : c0208_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0208_pcnt is "+c0208_pcnt );
}
String c0209_sect_nm = req.getParameter("c0209_sect_nm");
if( c0209_sect_nm == null){
	System.out.println(this.toString+" : c0209_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0209_sect_nm is "+c0209_sect_nm );
}
String c0209_out_clsf = req.getParameter("c0209_out_clsf");
if( c0209_out_clsf == null){
	System.out.println(this.toString+" : c0209_out_clsf is null" );
}else{
	System.out.println(this.toString+" : c0209_out_clsf is "+c0209_out_clsf );
}
String c0210_sect_nm = req.getParameter("c0210_sect_nm");
if( c0210_sect_nm == null){
	System.out.println(this.toString+" : c0210_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0210_sect_nm is "+c0210_sect_nm );
}
String c0210_out_clsf = req.getParameter("c0210_out_clsf");
if( c0210_out_clsf == null){
	System.out.println(this.toString+" : c0210_out_clsf is null" );
}else{
	System.out.println(this.toString+" : c0210_out_clsf is "+c0210_out_clsf );
}
String c0211_sect_nm = req.getParameter("c0211_sect_nm");
if( c0211_sect_nm == null){
	System.out.println(this.toString+" : c0211_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0211_sect_nm is "+c0211_sect_nm );
}
String c0211_out_clsf = req.getParameter("c0211_out_clsf");
if( c0211_out_clsf == null){
	System.out.println(this.toString+" : c0211_out_clsf is null" );
}else{
	System.out.println(this.toString+" : c0211_out_clsf is "+c0211_out_clsf );
}
String advt_ocpy_rate = req.getParameter("advt_ocpy_rate");
if( advt_ocpy_rate == null){
	System.out.println(this.toString+" : advt_ocpy_rate is null" );
}else{
	System.out.println(this.toString+" : advt_ocpy_rate is "+advt_ocpy_rate );
}
String diff_amt = req.getParameter("diff_amt");
if( diff_amt == null){
	System.out.println(this.toString+" : diff_amt is null" );
}else{
	System.out.println(this.toString+" : diff_amt is "+diff_amt );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String oth_clsf = Util.checkString(req.getParameter("oth_clsf"));
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String tot_pcnt = Util.checkString(req.getParameter("tot_pcnt"));
String tot_clas = Util.checkString(req.getParameter("tot_clas"));
String clr_clas = Util.checkString(req.getParameter("clr_clas"));
String asum_pubc_amt = Util.checkString(req.getParameter("asum_pubc_amt"));
String c0201_pcnt = Util.checkString(req.getParameter("c0201_pcnt"));
String c0202_pcnt = Util.checkString(req.getParameter("c0202_pcnt"));
String c0203_pcnt = Util.checkString(req.getParameter("c0203_pcnt"));
String c0204_pcnt = Util.checkString(req.getParameter("c0204_pcnt"));
String c0205_pcnt = Util.checkString(req.getParameter("c0205_pcnt"));
String c0206_pcnt = Util.checkString(req.getParameter("c0206_pcnt"));
String c0207_sect_nm = Util.checkString(req.getParameter("c0207_sect_nm"));
String c0207_pcnt = Util.checkString(req.getParameter("c0207_pcnt"));
String c0208_sect_nm = Util.checkString(req.getParameter("c0208_sect_nm"));
String c0208_pcnt = Util.checkString(req.getParameter("c0208_pcnt"));
String c0209_sect_nm = Util.checkString(req.getParameter("c0209_sect_nm"));
String c0209_out_clsf = Util.checkString(req.getParameter("c0209_out_clsf"));
String c0210_sect_nm = Util.checkString(req.getParameter("c0210_sect_nm"));
String c0210_out_clsf = Util.checkString(req.getParameter("c0210_out_clsf"));
String c0211_sect_nm = Util.checkString(req.getParameter("c0211_sect_nm"));
String c0211_out_clsf = Util.checkString(req.getParameter("c0211_out_clsf"));
String advt_ocpy_rate = Util.checkString(req.getParameter("advt_ocpy_rate"));
String diff_amt = Util.checkString(req.getParameter("diff_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String oth_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("oth_clsf")));
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String tot_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_pcnt")));
String tot_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_clas")));
String clr_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_clas")));
String asum_pubc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("asum_pubc_amt")));
String c0201_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0201_pcnt")));
String c0202_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0202_pcnt")));
String c0203_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0203_pcnt")));
String c0204_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0204_pcnt")));
String c0205_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0205_pcnt")));
String c0206_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0206_pcnt")));
String c0207_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0207_sect_nm")));
String c0207_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0207_pcnt")));
String c0208_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0208_sect_nm")));
String c0208_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0208_pcnt")));
String c0209_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0209_sect_nm")));
String c0209_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c0209_out_clsf")));
String c0210_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0210_sect_nm")));
String c0210_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c0210_out_clsf")));
String c0211_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0211_sect_nm")));
String c0211_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c0211_out_clsf")));
String advt_ocpy_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_ocpy_rate")));
String diff_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("diff_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOth_clsf(oth_clsf);
dm.setPubc_dt(pubc_dt);
dm.setMode(mode);
dm.setSeq(seq);
dm.setTot_pcnt(tot_pcnt);
dm.setTot_clas(tot_clas);
dm.setClr_clas(clr_clas);
dm.setAsum_pubc_amt(asum_pubc_amt);
dm.setC0201_pcnt(c0201_pcnt);
dm.setC0202_pcnt(c0202_pcnt);
dm.setC0203_pcnt(c0203_pcnt);
dm.setC0204_pcnt(c0204_pcnt);
dm.setC0205_pcnt(c0205_pcnt);
dm.setC0206_pcnt(c0206_pcnt);
dm.setC0207_sect_nm(c0207_sect_nm);
dm.setC0207_pcnt(c0207_pcnt);
dm.setC0208_sect_nm(c0208_sect_nm);
dm.setC0208_pcnt(c0208_pcnt);
dm.setC0209_sect_nm(c0209_sect_nm);
dm.setC0209_out_clsf(c0209_out_clsf);
dm.setC0210_sect_nm(c0210_sect_nm);
dm.setC0210_out_clsf(c0210_out_clsf);
dm.setC0211_sect_nm(c0211_sect_nm);
dm.setC0211_out_clsf(c0211_out_clsf);
dm.setAdvt_ocpy_rate(advt_ocpy_rate);
dm.setDiff_amt(diff_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 18:26:35 KST 2009 */