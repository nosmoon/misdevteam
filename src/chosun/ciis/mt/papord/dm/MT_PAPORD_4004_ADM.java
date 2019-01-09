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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_4004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mode;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String prt_clsf;
	public String pap_std;
	public String issu_pcnt;
	public String issu_qty;
	public String dual_out_clsf;
	public String roll_wgt_a;
	public String wgt_a;
	public String roll_cnt_a;
	public String roll_wgt_b;
	public String wgt_b;
	public String roll_cnt_b;
	public String roll_wgt_c;
	public String wgt_c;
	public String roll_cnt_c;
	public String matr_cd_a;
	public String matr_cd_b;
	public String matr_cd_c;

	public MT_PAPORD_4004_ADM(){}
	public MT_PAPORD_4004_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String mode, String issu_dt, String fac_clsf, String medi_cd, String sect_cd, String prt_clsf, String pap_std, String issu_pcnt, String issu_qty, String dual_out_clsf, String roll_wgt_a, String wgt_a, String roll_cnt_a, String roll_wgt_b, String wgt_b, String roll_cnt_b, String roll_wgt_c, String wgt_c, String roll_cnt_c, String matr_cd_a, String matr_cd_b, String matr_cd_c){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.prt_clsf	= prt_clsf;
		this.pap_std	= pap_std;
		this.issu_pcnt = issu_pcnt;
		this.issu_qty = issu_qty;
		this.dual_out_clsf = dual_out_clsf;
		this.roll_wgt_a = roll_wgt_a;
		this.wgt_a = wgt_a;
		this.roll_cnt_a = roll_cnt_a;
		this.roll_wgt_b = roll_wgt_b;
		this.wgt_b = wgt_b;
		this.roll_cnt_b = roll_cnt_b;
		this.roll_wgt_c = roll_wgt_c;
		this.wgt_c = wgt_c;
		this.roll_cnt_c = roll_cnt_c;
		this.matr_cd_a = matr_cd_a;
		this.matr_cd_b = matr_cd_b;
		this.matr_cd_c = matr_cd_c;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}
	
	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}
	
	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setRoll_wgt_a(String roll_wgt_a){
		this.roll_wgt_a = roll_wgt_a;
	}

	public void setWgt_a(String wgt_a){
		this.wgt_a = wgt_a;
	}

	public void setRoll_cnt_a(String roll_cnt_a){
		this.roll_cnt_a = roll_cnt_a;
	}

	public void setRoll_wgt_b(String roll_wgt_b){
		this.roll_wgt_b = roll_wgt_b;
	}

	public void setWgt_b(String wgt_b){
		this.wgt_b = wgt_b;
	}

	public void setRoll_cnt_b(String roll_cnt_b){
		this.roll_cnt_b = roll_cnt_b;
	}

	public void setRoll_wgt_c(String roll_wgt_c){
		this.roll_wgt_c = roll_wgt_c;
	}

	public void setWgt_c(String wgt_c){
		this.wgt_c = wgt_c;
	}

	public void setRoll_cnt_c(String roll_cnt_c){
		this.roll_cnt_c = roll_cnt_c;
	}

	public void setMatr_cd_a(String matr_cd_a){
		this.matr_cd_a = matr_cd_a;
	}

	public void setMatr_cd_b(String matr_cd_b){
		this.matr_cd_b = matr_cd_b;
	}

	public void setMatr_cd_c(String matr_cd_c){
		this.matr_cd_c = matr_cd_c;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}
	
	public String getPap_std(){
		return this.pap_std;
	}
	
	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getRoll_wgt_a(){
		return this.roll_wgt_a;
	}

	public String getWgt_a(){
		return this.wgt_a;
	}

	public String getRoll_cnt_a(){
		return this.roll_cnt_a;
	}

	public String getRoll_wgt_b(){
		return this.roll_wgt_b;
	}

	public String getWgt_b(){
		return this.wgt_b;
	}

	public String getRoll_cnt_b(){
		return this.roll_cnt_b;
	}

	public String getRoll_wgt_c(){
		return this.roll_wgt_c;
	}

	public String getWgt_c(){
		return this.wgt_c;
	}

	public String getRoll_cnt_c(){
		return this.roll_cnt_c;
	}

	public String getMatr_cd_a(){
		return this.matr_cd_a;
	}

	public String getMatr_cd_b(){
		return this.matr_cd_b;
	}

	public String getMatr_cd_c(){
		return this.matr_cd_c;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_4004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_4004_ADM dm = (MT_PAPORD_4004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.issu_dt);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.sect_cd);
		cstmt.setString(11, dm.prt_clsf);
		cstmt.setString(12, dm.pap_std);
		cstmt.setString(13, dm.issu_pcnt);
		cstmt.setString(14, dm.issu_qty);
		cstmt.setString(15, dm.dual_out_clsf);
		cstmt.setString(16, dm.roll_wgt_a);
		cstmt.setString(17, dm.wgt_a);
		cstmt.setString(18, dm.roll_cnt_a);
		cstmt.setString(19, dm.roll_wgt_b);
		cstmt.setString(20, dm.wgt_b);
		cstmt.setString(21, dm.roll_cnt_b);
		cstmt.setString(22, dm.roll_wgt_c);
		cstmt.setString(23, dm.wgt_c);
		cstmt.setString(24, dm.roll_cnt_c);
		cstmt.setString(25, dm.matr_cd_a);
		cstmt.setString(26, dm.matr_cd_b);
		cstmt.setString(27, dm.matr_cd_c);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_4004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("prt_clsf = [" + getPrt_clsf() + "]");
		System.out.println("pap_std = [" + getPap_std() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("issu_qty = [" + getIssu_qty() + "]");
		System.out.println("dual_out_clsf = [" + getDual_out_clsf() + "]");
		System.out.println("roll_wgt_a = [" + getRoll_wgt_a() + "]");
		System.out.println("wgt_a = [" + getWgt_a() + "]");
		System.out.println("roll_cnt_a = [" + getRoll_cnt_a() + "]");
		System.out.println("roll_wgt_b = [" + getRoll_wgt_b() + "]");
		System.out.println("wgt_b = [" + getWgt_b() + "]");
		System.out.println("roll_cnt_b = [" + getRoll_cnt_b() + "]");
		System.out.println("roll_wgt_c = [" + getRoll_wgt_c() + "]");
		System.out.println("wgt_c = [" + getWgt_c() + "]");
		System.out.println("roll_cnt_c = [" + getRoll_cnt_c() + "]");
		System.out.println("matr_cd_a = [" + getMatr_cd_a() + "]");
		System.out.println("matr_cd_b = [" + getMatr_cd_b() + "]");
		System.out.println("matr_cd_c = [" + getMatr_cd_c() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String issu_qty = req.getParameter("issu_qty");
if( issu_qty == null){
	System.out.println(this.toString+" : issu_qty is null" );
}else{
	System.out.println(this.toString+" : issu_qty is "+issu_qty );
}
String dual_out_clsf = req.getParameter("dual_out_clsf");
if( dual_out_clsf == null){
	System.out.println(this.toString+" : dual_out_clsf is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf is "+dual_out_clsf );
}
String roll_wgt_a = req.getParameter("roll_wgt_a");
if( roll_wgt_a == null){
	System.out.println(this.toString+" : roll_wgt_a is null" );
}else{
	System.out.println(this.toString+" : roll_wgt_a is "+roll_wgt_a );
}
String wgt_a = req.getParameter("wgt_a");
if( wgt_a == null){
	System.out.println(this.toString+" : wgt_a is null" );
}else{
	System.out.println(this.toString+" : wgt_a is "+wgt_a );
}
String roll_cnt_a = req.getParameter("roll_cnt_a");
if( roll_cnt_a == null){
	System.out.println(this.toString+" : roll_cnt_a is null" );
}else{
	System.out.println(this.toString+" : roll_cnt_a is "+roll_cnt_a );
}
String roll_wgt_b = req.getParameter("roll_wgt_b");
if( roll_wgt_b == null){
	System.out.println(this.toString+" : roll_wgt_b is null" );
}else{
	System.out.println(this.toString+" : roll_wgt_b is "+roll_wgt_b );
}
String wgt_b = req.getParameter("wgt_b");
if( wgt_b == null){
	System.out.println(this.toString+" : wgt_b is null" );
}else{
	System.out.println(this.toString+" : wgt_b is "+wgt_b );
}
String roll_cnt_b = req.getParameter("roll_cnt_b");
if( roll_cnt_b == null){
	System.out.println(this.toString+" : roll_cnt_b is null" );
}else{
	System.out.println(this.toString+" : roll_cnt_b is "+roll_cnt_b );
}
String roll_wgt_c = req.getParameter("roll_wgt_c");
if( roll_wgt_c == null){
	System.out.println(this.toString+" : roll_wgt_c is null" );
}else{
	System.out.println(this.toString+" : roll_wgt_c is "+roll_wgt_c );
}
String wgt_c = req.getParameter("wgt_c");
if( wgt_c == null){
	System.out.println(this.toString+" : wgt_c is null" );
}else{
	System.out.println(this.toString+" : wgt_c is "+wgt_c );
}
String roll_cnt_c = req.getParameter("roll_cnt_c");
if( roll_cnt_c == null){
	System.out.println(this.toString+" : roll_cnt_c is null" );
}else{
	System.out.println(this.toString+" : roll_cnt_c is "+roll_cnt_c );
}
String matr_cd_a = req.getParameter("matr_cd_a");
if( matr_cd_a == null){
	System.out.println(this.toString+" : matr_cd_a is null" );
}else{
	System.out.println(this.toString+" : matr_cd_a is "+matr_cd_a );
}
String matr_cd_b = req.getParameter("matr_cd_b");
if( matr_cd_b == null){
	System.out.println(this.toString+" : matr_cd_b is null" );
}else{
	System.out.println(this.toString+" : matr_cd_b is "+matr_cd_b );
}
String matr_cd_c = req.getParameter("matr_cd_c");
if( matr_cd_c == null){
	System.out.println(this.toString+" : matr_cd_c is null" );
}else{
	System.out.println(this.toString+" : matr_cd_c is "+matr_cd_c );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String issu_qty = Util.checkString(req.getParameter("issu_qty"));
String dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
String roll_wgt_a = Util.checkString(req.getParameter("roll_wgt_a"));
String wgt_a = Util.checkString(req.getParameter("wgt_a"));
String roll_cnt_a = Util.checkString(req.getParameter("roll_cnt_a"));
String roll_wgt_b = Util.checkString(req.getParameter("roll_wgt_b"));
String wgt_b = Util.checkString(req.getParameter("wgt_b"));
String roll_cnt_b = Util.checkString(req.getParameter("roll_cnt_b"));
String roll_wgt_c = Util.checkString(req.getParameter("roll_wgt_c"));
String wgt_c = Util.checkString(req.getParameter("wgt_c"));
String roll_cnt_c = Util.checkString(req.getParameter("roll_cnt_c"));
String matr_cd_a = Util.checkString(req.getParameter("matr_cd_a"));
String matr_cd_b = Util.checkString(req.getParameter("matr_cd_b"));
String matr_cd_c = Util.checkString(req.getParameter("matr_cd_c"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String issu_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_qty")));
String dual_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf")));
String roll_wgt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_wgt_a")));
String wgt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_a")));
String roll_cnt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_cnt_a")));
String roll_wgt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_wgt_b")));
String wgt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_b")));
String roll_cnt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_cnt_b")));
String roll_wgt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_wgt_c")));
String wgt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_c")));
String roll_cnt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_cnt_c")));
String matr_cd_a = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_a")));
String matr_cd_b = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_b")));
String matr_cd_c = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_c")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_pcnt(issu_pcnt);
dm.setIssu_qty(issu_qty);
dm.setDual_out_clsf(dual_out_clsf);
dm.setRoll_wgt_a(roll_wgt_a);
dm.setWgt_a(wgt_a);
dm.setRoll_cnt_a(roll_cnt_a);
dm.setRoll_wgt_b(roll_wgt_b);
dm.setWgt_b(wgt_b);
dm.setRoll_cnt_b(roll_cnt_b);
dm.setRoll_wgt_c(roll_wgt_c);
dm.setWgt_c(wgt_c);
dm.setRoll_cnt_c(roll_cnt_c);
dm.setMatr_cd_a(matr_cd_a);
dm.setMatr_cd_b(matr_cd_b);
dm.setMatr_cd_c(matr_cd_c);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 13:48:54 KST 2009 */