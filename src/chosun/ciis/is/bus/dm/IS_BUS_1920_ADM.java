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


package chosun.ciis.is.bus.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.ds.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1920_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String preng_dt;
	public String seq;
	public String sale_clsf;
	public String spcsale_clsf;
	public String medi_cd;
	public String area_nm;
	public String advcs_nm;
	public String remk_matt;
	public String area_cd;
	public String dept_cd;
	public String sub_dept_cd;
	public String make_pers;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_BUS_1920_ADM(){}
	public IS_BUS_1920_ADM(String cmpy_cd, String mode, String preng_dt, String seq, String sale_clsf, String spcsale_clsf, String medi_cd, String area_nm, String advcs_nm, String remk_matt, String area_cd, String dept_cd, String sub_dept_cd, String make_pers, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.preng_dt = preng_dt;
		this.seq = seq;
		this.sale_clsf = sale_clsf;
		this.spcsale_clsf = spcsale_clsf;
		this.medi_cd = medi_cd;
		this.area_nm = area_nm;
		this.advcs_nm = advcs_nm;
		this.remk_matt = remk_matt;
		this.area_cd = area_cd;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.make_pers = make_pers;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpcsale_clsf(String spcsale_clsf){
		this.spcsale_clsf = spcsale_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setRemk_matt(String remk_matt){
		this.remk_matt = remk_matt;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpcsale_clsf(){
		return this.spcsale_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getRemk_matt(){
		return this.remk_matt;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BUS_1920_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BUS_1920_ADM dm = (IS_BUS_1920_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.preng_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.sale_clsf);
		cstmt.setString(8, dm.spcsale_clsf);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.area_nm);
		cstmt.setString(11, dm.advcs_nm);
		cstmt.setString(12, dm.remk_matt);
		cstmt.setString(13, dm.area_cd);
		cstmt.setString(14, dm.dept_cd);
		cstmt.setString(15, dm.sub_dept_cd);
		cstmt.setString(16, dm.make_pers);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bus.ds.IS_BUS_1920_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("preng_dt = [" + getPreng_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spcsale_clsf = [" + getSpcsale_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("area_nm = [" + getArea_nm() + "]");
		System.out.println("advcs_nm = [" + getAdvcs_nm() + "]");
		System.out.println("remk_matt = [" + getRemk_matt() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("make_pers = [" + getMake_pers() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String preng_dt = req.getParameter("preng_dt");
if( preng_dt == null){
	System.out.println(this.toString+" : preng_dt is null" );
}else{
	System.out.println(this.toString+" : preng_dt is "+preng_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spcsale_clsf = req.getParameter("spcsale_clsf");
if( spcsale_clsf == null){
	System.out.println(this.toString+" : spcsale_clsf is null" );
}else{
	System.out.println(this.toString+" : spcsale_clsf is "+spcsale_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String area_nm = req.getParameter("area_nm");
if( area_nm == null){
	System.out.println(this.toString+" : area_nm is null" );
}else{
	System.out.println(this.toString+" : area_nm is "+area_nm );
}
String advcs_nm = req.getParameter("advcs_nm");
if( advcs_nm == null){
	System.out.println(this.toString+" : advcs_nm is null" );
}else{
	System.out.println(this.toString+" : advcs_nm is "+advcs_nm );
}
String remk_matt = req.getParameter("remk_matt");
if( remk_matt == null){
	System.out.println(this.toString+" : remk_matt is null" );
}else{
	System.out.println(this.toString+" : remk_matt is "+remk_matt );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String make_pers = req.getParameter("make_pers");
if( make_pers == null){
	System.out.println(this.toString+" : make_pers is null" );
}else{
	System.out.println(this.toString+" : make_pers is "+make_pers );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String preng_dt = Util.checkString(req.getParameter("preng_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spcsale_clsf = Util.checkString(req.getParameter("spcsale_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String area_nm = Util.checkString(req.getParameter("area_nm"));
String advcs_nm = Util.checkString(req.getParameter("advcs_nm"));
String remk_matt = Util.checkString(req.getParameter("remk_matt"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String make_pers = Util.checkString(req.getParameter("make_pers"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String preng_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("preng_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spcsale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spcsale_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String area_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("area_nm")));
String advcs_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advcs_nm")));
String remk_matt = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_matt")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String make_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("make_pers")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setPreng_dt(preng_dt);
dm.setSeq(seq);
dm.setSale_clsf(sale_clsf);
dm.setSpcsale_clsf(spcsale_clsf);
dm.setMedi_cd(medi_cd);
dm.setArea_nm(area_nm);
dm.setAdvcs_nm(advcs_nm);
dm.setRemk_matt(remk_matt);
dm.setArea_cd(area_cd);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setMake_pers(make_pers);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 20 20:36:31 KST 2012 */