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


public class AD_BAS_3221_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String oth_clsf;
	public String pubc_dt;
	public String mode;
	public String seq;
	public String tot_pcnt;
	public String tot_cell;
	public String clr_cell;
	public String asum_pubc_amt;
	public String c0101_pcnt;
	public String c0102_pcnt;
	public String c0103_pcnt;
	public String c0104_pcnt;
	public String c0105_pcnt;
	public String c0106_pcnt;
	public String c0107_pcnt;
	public String c0108_sect_nm;
	public String c0108_pcnt;
	public String c0109_sect_nm;
	public String c0109_pcnt;
	public String c0110_sect_nm;
	public String c0110_out_clsf;
	public String c0111_sect_nm;
	public String c0111_out_clsf;
	public String c0112_sect_nm;
	public String c0112_out_clsf;
	public String advt_ocpy_rate;
	public String diff_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_BAS_3221_ADM(){}
	public AD_BAS_3221_ADM(String cmpy_cd, String oth_clsf, String pubc_dt, String mode, String seq, String tot_pcnt, String tot_cell, String clr_cell, String asum_pubc_amt, String c0101_pcnt, String c0102_pcnt, String c0103_pcnt, String c0104_pcnt, String c0105_pcnt, String c0106_pcnt, String c0107_pcnt, String c0108_sect_nm, String c0108_pcnt, String c0109_sect_nm, String c0109_pcnt, String c0110_sect_nm, String c0110_out_clsf, String c0111_sect_nm, String c0111_out_clsf, String c0112_sect_nm, String c0112_out_clsf, String advt_ocpy_rate, String diff_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.oth_clsf = oth_clsf;
		this.pubc_dt = pubc_dt;
		this.mode = mode;
		this.seq = seq;
		this.tot_pcnt = tot_pcnt;
		this.tot_cell = tot_cell;
		this.clr_cell = clr_cell;
		this.asum_pubc_amt = asum_pubc_amt;
		this.c0101_pcnt = c0101_pcnt;
		this.c0102_pcnt = c0102_pcnt;
		this.c0103_pcnt = c0103_pcnt;
		this.c0104_pcnt = c0104_pcnt;
		this.c0105_pcnt = c0105_pcnt;
		this.c0106_pcnt = c0106_pcnt;
		this.c0107_pcnt = c0107_pcnt;
		this.c0108_sect_nm = c0108_sect_nm;
		this.c0108_pcnt = c0108_pcnt;
		this.c0109_sect_nm = c0109_sect_nm;
		this.c0109_pcnt = c0109_pcnt;
		this.c0110_sect_nm = c0110_sect_nm;
		this.c0110_out_clsf = c0110_out_clsf;
		this.c0111_sect_nm = c0111_sect_nm;
		this.c0111_out_clsf = c0111_out_clsf;
		this.c0112_sect_nm = c0112_sect_nm;
		this.c0112_out_clsf = c0112_out_clsf;
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

	public void setTot_cell(String tot_cell){
		this.tot_cell = tot_cell;
	}

	public void setClr_cell(String clr_cell){
		this.clr_cell = clr_cell;
	}

	public void setAsum_pubc_amt(String asum_pubc_amt){
		this.asum_pubc_amt = asum_pubc_amt;
	}

	public void setC0101_pcnt(String c0101_pcnt){
		this.c0101_pcnt = c0101_pcnt;
	}

	public void setC0102_pcnt(String c0102_pcnt){
		this.c0102_pcnt = c0102_pcnt;
	}

	public void setC0103_pcnt(String c0103_pcnt){
		this.c0103_pcnt = c0103_pcnt;
	}

	public void setC0104_pcnt(String c0104_pcnt){
		this.c0104_pcnt = c0104_pcnt;
	}

	public void setC0105_pcnt(String c0105_pcnt){
		this.c0105_pcnt = c0105_pcnt;
	}

	public void setC0106_pcnt(String c0106_pcnt){
		this.c0106_pcnt = c0106_pcnt;
	}

	public void setC0107_pcnt(String c0107_pcnt){
		this.c0107_pcnt = c0107_pcnt;
	}

	public void setC0108_sect_nm(String c0108_sect_nm){
		this.c0108_sect_nm = c0108_sect_nm;
	}

	public void setC0108_pcnt(String c0108_pcnt){
		this.c0108_pcnt = c0108_pcnt;
	}

	public void setC0109_sect_nm(String c0109_sect_nm){
		this.c0109_sect_nm = c0109_sect_nm;
	}

	public void setC0109_pcnt(String c0109_pcnt){
		this.c0109_pcnt = c0109_pcnt;
	}

	public void setC0110_sect_nm(String c0110_sect_nm){
		this.c0110_sect_nm = c0110_sect_nm;
	}

	public void setC0110_out_clsf(String c0110_out_clsf){
		this.c0110_out_clsf = c0110_out_clsf;
	}

	public void setC0111_sect_nm(String c0111_sect_nm){
		this.c0111_sect_nm = c0111_sect_nm;
	}

	public void setC0111_out_clsf(String c0111_out_clsf){
		this.c0111_out_clsf = c0111_out_clsf;
	}

	public void setC0112_sect_nm(String c0112_sect_nm){
		this.c0112_sect_nm = c0112_sect_nm;
	}

	public void setC0112_out_clsf(String c0112_out_clsf){
		this.c0112_out_clsf = c0112_out_clsf;
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

	public String getTot_cell(){
		return this.tot_cell;
	}

	public String getClr_cell(){
		return this.clr_cell;
	}

	public String getAsum_pubc_amt(){
		return this.asum_pubc_amt;
	}

	public String getC0101_pcnt(){
		return this.c0101_pcnt;
	}

	public String getC0102_pcnt(){
		return this.c0102_pcnt;
	}

	public String getC0103_pcnt(){
		return this.c0103_pcnt;
	}

	public String getC0104_pcnt(){
		return this.c0104_pcnt;
	}

	public String getC0105_pcnt(){
		return this.c0105_pcnt;
	}

	public String getC0106_pcnt(){
		return this.c0106_pcnt;
	}

	public String getC0107_pcnt(){
		return this.c0107_pcnt;
	}

	public String getC0108_sect_nm(){
		return this.c0108_sect_nm;
	}

	public String getC0108_pcnt(){
		return this.c0108_pcnt;
	}

	public String getC0109_sect_nm(){
		return this.c0109_sect_nm;
	}

	public String getC0109_pcnt(){
		return this.c0109_pcnt;
	}

	public String getC0110_sect_nm(){
		return this.c0110_sect_nm;
	}

	public String getC0110_out_clsf(){
		return this.c0110_out_clsf;
	}

	public String getC0111_sect_nm(){
		return this.c0111_sect_nm;
	}

	public String getC0111_out_clsf(){
		return this.c0111_out_clsf;
	}

	public String getC0112_sect_nm(){
		return this.c0112_sect_nm;
	}

	public String getC0112_out_clsf(){
		return this.c0112_out_clsf;
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
		 return "{ call MISADV.SP_AD_BAS_3221_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3221_ADM dm = (AD_BAS_3221_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.oth_clsf);
		cstmt.setString(5, dm.pubc_dt);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.tot_pcnt);
		cstmt.setString(9, dm.tot_cell);
		cstmt.setString(10, dm.clr_cell);
		cstmt.setString(11, dm.asum_pubc_amt);
		cstmt.setString(12, dm.c0101_pcnt);
		cstmt.setString(13, dm.c0102_pcnt);
		cstmt.setString(14, dm.c0103_pcnt);
		cstmt.setString(15, dm.c0104_pcnt);
		cstmt.setString(16, dm.c0105_pcnt);
		cstmt.setString(17, dm.c0106_pcnt);
		cstmt.setString(18, dm.c0107_pcnt);
		cstmt.setString(19, dm.c0108_sect_nm);
		cstmt.setString(20, dm.c0108_pcnt);
		cstmt.setString(21, dm.c0109_sect_nm);
		cstmt.setString(22, dm.c0109_pcnt);
		cstmt.setString(23, dm.c0110_sect_nm);
		cstmt.setString(24, dm.c0110_out_clsf);
		cstmt.setString(25, dm.c0111_sect_nm);
		cstmt.setString(26, dm.c0111_out_clsf);
		cstmt.setString(27, dm.c0112_sect_nm);
		cstmt.setString(28, dm.c0112_out_clsf);
		cstmt.setString(29, dm.advt_ocpy_rate);
		cstmt.setString(30, dm.diff_amt);
		cstmt.setString(31, dm.incmg_pers_ip);
		cstmt.setString(32, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3221_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("oth_clsf = [" + getOth_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("tot_pcnt = [" + getTot_pcnt() + "]");
		System.out.println("tot_cell = [" + getTot_cell() + "]");
		System.out.println("clr_cell = [" + getClr_cell() + "]");
		System.out.println("asum_pubc_amt = [" + getAsum_pubc_amt() + "]");
		System.out.println("c0101_pcnt = [" + getC0101_pcnt() + "]");
		System.out.println("c0102_pcnt = [" + getC0102_pcnt() + "]");
		System.out.println("c0103_pcnt = [" + getC0103_pcnt() + "]");
		System.out.println("c0104_pcnt = [" + getC0104_pcnt() + "]");
		System.out.println("c0105_pcnt = [" + getC0105_pcnt() + "]");
		System.out.println("c0106_pcnt = [" + getC0106_pcnt() + "]");
		System.out.println("c0107_pcnt = [" + getC0107_pcnt() + "]");
		System.out.println("c0108_sect_nm = [" + getC0108_sect_nm() + "]");
		System.out.println("c0108_pcnt = [" + getC0108_pcnt() + "]");
		System.out.println("c0109_sect_nm = [" + getC0109_sect_nm() + "]");
		System.out.println("c0109_pcnt = [" + getC0109_pcnt() + "]");
		System.out.println("c0110_sect_nm = [" + getC0110_sect_nm() + "]");
		System.out.println("c0110_out_clsf = [" + getC0110_out_clsf() + "]");
		System.out.println("c0111_sect_nm = [" + getC0111_sect_nm() + "]");
		System.out.println("c0111_out_clsf = [" + getC0111_out_clsf() + "]");
		System.out.println("c0112_sect_nm = [" + getC0112_sect_nm() + "]");
		System.out.println("c0112_out_clsf = [" + getC0112_out_clsf() + "]");
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
String tot_cell = req.getParameter("tot_cell");
if( tot_cell == null){
	System.out.println(this.toString+" : tot_cell is null" );
}else{
	System.out.println(this.toString+" : tot_cell is "+tot_cell );
}
String clr_cell = req.getParameter("clr_cell");
if( clr_cell == null){
	System.out.println(this.toString+" : clr_cell is null" );
}else{
	System.out.println(this.toString+" : clr_cell is "+clr_cell );
}
String asum_pubc_amt = req.getParameter("asum_pubc_amt");
if( asum_pubc_amt == null){
	System.out.println(this.toString+" : asum_pubc_amt is null" );
}else{
	System.out.println(this.toString+" : asum_pubc_amt is "+asum_pubc_amt );
}
String c0101_pcnt = req.getParameter("c0101_pcnt");
if( c0101_pcnt == null){
	System.out.println(this.toString+" : c0101_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0101_pcnt is "+c0101_pcnt );
}
String c0102_pcnt = req.getParameter("c0102_pcnt");
if( c0102_pcnt == null){
	System.out.println(this.toString+" : c0102_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0102_pcnt is "+c0102_pcnt );
}
String c0103_pcnt = req.getParameter("c0103_pcnt");
if( c0103_pcnt == null){
	System.out.println(this.toString+" : c0103_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0103_pcnt is "+c0103_pcnt );
}
String c0104_pcnt = req.getParameter("c0104_pcnt");
if( c0104_pcnt == null){
	System.out.println(this.toString+" : c0104_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0104_pcnt is "+c0104_pcnt );
}
String c0105_pcnt = req.getParameter("c0105_pcnt");
if( c0105_pcnt == null){
	System.out.println(this.toString+" : c0105_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0105_pcnt is "+c0105_pcnt );
}
String c0106_pcnt = req.getParameter("c0106_pcnt");
if( c0106_pcnt == null){
	System.out.println(this.toString+" : c0106_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0106_pcnt is "+c0106_pcnt );
}
String c0107_pcnt = req.getParameter("c0107_pcnt");
if( c0107_pcnt == null){
	System.out.println(this.toString+" : c0107_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0107_pcnt is "+c0107_pcnt );
}
String c0108_sect_nm = req.getParameter("c0108_sect_nm");
if( c0108_sect_nm == null){
	System.out.println(this.toString+" : c0108_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0108_sect_nm is "+c0108_sect_nm );
}
String c0108_pcnt = req.getParameter("c0108_pcnt");
if( c0108_pcnt == null){
	System.out.println(this.toString+" : c0108_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0108_pcnt is "+c0108_pcnt );
}
String c0109_sect_nm = req.getParameter("c0109_sect_nm");
if( c0109_sect_nm == null){
	System.out.println(this.toString+" : c0109_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0109_sect_nm is "+c0109_sect_nm );
}
String c0109_pcnt = req.getParameter("c0109_pcnt");
if( c0109_pcnt == null){
	System.out.println(this.toString+" : c0109_pcnt is null" );
}else{
	System.out.println(this.toString+" : c0109_pcnt is "+c0109_pcnt );
}
String c0110_sect_nm = req.getParameter("c0110_sect_nm");
if( c0110_sect_nm == null){
	System.out.println(this.toString+" : c0110_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0110_sect_nm is "+c0110_sect_nm );
}
String c0110_out_clsf = req.getParameter("c0110_out_clsf");
if( c0110_out_clsf == null){
	System.out.println(this.toString+" : c0110_out_clsf is null" );
}else{
	System.out.println(this.toString+" : c0110_out_clsf is "+c0110_out_clsf );
}
String c0111_sect_nm = req.getParameter("c0111_sect_nm");
if( c0111_sect_nm == null){
	System.out.println(this.toString+" : c0111_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0111_sect_nm is "+c0111_sect_nm );
}
String c0111_out_clsf = req.getParameter("c0111_out_clsf");
if( c0111_out_clsf == null){
	System.out.println(this.toString+" : c0111_out_clsf is null" );
}else{
	System.out.println(this.toString+" : c0111_out_clsf is "+c0111_out_clsf );
}
String c0112_sect_nm = req.getParameter("c0112_sect_nm");
if( c0112_sect_nm == null){
	System.out.println(this.toString+" : c0112_sect_nm is null" );
}else{
	System.out.println(this.toString+" : c0112_sect_nm is "+c0112_sect_nm );
}
String c0112_out_clsf = req.getParameter("c0112_out_clsf");
if( c0112_out_clsf == null){
	System.out.println(this.toString+" : c0112_out_clsf is null" );
}else{
	System.out.println(this.toString+" : c0112_out_clsf is "+c0112_out_clsf );
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
String tot_cell = Util.checkString(req.getParameter("tot_cell"));
String clr_cell = Util.checkString(req.getParameter("clr_cell"));
String asum_pubc_amt = Util.checkString(req.getParameter("asum_pubc_amt"));
String c0101_pcnt = Util.checkString(req.getParameter("c0101_pcnt"));
String c0102_pcnt = Util.checkString(req.getParameter("c0102_pcnt"));
String c0103_pcnt = Util.checkString(req.getParameter("c0103_pcnt"));
String c0104_pcnt = Util.checkString(req.getParameter("c0104_pcnt"));
String c0105_pcnt = Util.checkString(req.getParameter("c0105_pcnt"));
String c0106_pcnt = Util.checkString(req.getParameter("c0106_pcnt"));
String c0107_pcnt = Util.checkString(req.getParameter("c0107_pcnt"));
String c0108_sect_nm = Util.checkString(req.getParameter("c0108_sect_nm"));
String c0108_pcnt = Util.checkString(req.getParameter("c0108_pcnt"));
String c0109_sect_nm = Util.checkString(req.getParameter("c0109_sect_nm"));
String c0109_pcnt = Util.checkString(req.getParameter("c0109_pcnt"));
String c0110_sect_nm = Util.checkString(req.getParameter("c0110_sect_nm"));
String c0110_out_clsf = Util.checkString(req.getParameter("c0110_out_clsf"));
String c0111_sect_nm = Util.checkString(req.getParameter("c0111_sect_nm"));
String c0111_out_clsf = Util.checkString(req.getParameter("c0111_out_clsf"));
String c0112_sect_nm = Util.checkString(req.getParameter("c0112_sect_nm"));
String c0112_out_clsf = Util.checkString(req.getParameter("c0112_out_clsf"));
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
String tot_cell = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_cell")));
String clr_cell = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_cell")));
String asum_pubc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("asum_pubc_amt")));
String c0101_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0101_pcnt")));
String c0102_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0102_pcnt")));
String c0103_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0103_pcnt")));
String c0104_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0104_pcnt")));
String c0105_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0105_pcnt")));
String c0106_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0106_pcnt")));
String c0107_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0107_pcnt")));
String c0108_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0108_sect_nm")));
String c0108_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0108_pcnt")));
String c0109_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0109_sect_nm")));
String c0109_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("c0109_pcnt")));
String c0110_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0110_sect_nm")));
String c0110_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c0110_out_clsf")));
String c0111_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0111_sect_nm")));
String c0111_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c0111_out_clsf")));
String c0112_sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("c0112_sect_nm")));
String c0112_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("c0112_out_clsf")));
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
dm.setTot_cell(tot_cell);
dm.setClr_cell(clr_cell);
dm.setAsum_pubc_amt(asum_pubc_amt);
dm.setC0101_pcnt(c0101_pcnt);
dm.setC0102_pcnt(c0102_pcnt);
dm.setC0103_pcnt(c0103_pcnt);
dm.setC0104_pcnt(c0104_pcnt);
dm.setC0105_pcnt(c0105_pcnt);
dm.setC0106_pcnt(c0106_pcnt);
dm.setC0107_pcnt(c0107_pcnt);
dm.setC0108_sect_nm(c0108_sect_nm);
dm.setC0108_pcnt(c0108_pcnt);
dm.setC0109_sect_nm(c0109_sect_nm);
dm.setC0109_pcnt(c0109_pcnt);
dm.setC0110_sect_nm(c0110_sect_nm);
dm.setC0110_out_clsf(c0110_out_clsf);
dm.setC0111_sect_nm(c0111_sect_nm);
dm.setC0111_out_clsf(c0111_out_clsf);
dm.setC0112_sect_nm(c0112_sect_nm);
dm.setC0112_out_clsf(c0112_out_clsf);
dm.setAdvt_ocpy_rate(advt_ocpy_rate);
dm.setDiff_amt(diff_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 18:26:35 KST 2009 */