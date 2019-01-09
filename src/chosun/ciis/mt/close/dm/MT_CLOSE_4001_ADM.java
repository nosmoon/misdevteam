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


package chosun.ciis.mt.close.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.close.ds.*;
import chosun.ciis.mt.close.rec.*;

/**
 * 
 */


public class MT_CLOSE_4001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String row;
	public String cmpy_cd;
	public String dstb_rat_cd;
	public String dstb_rat_nm;
	public String basi;
	public String calc_styl;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_CLOSE_4001_ADM(){}
	public MT_CLOSE_4001_ADM(String mode, String row, String cmpy_cd, String dstb_rat_cd, String dstb_rat_nm, String basi, String calc_styl, String incmg_pers_ipaddr, String incmg_pers){
		this.mode = mode;
		this.row = row;
		this.cmpy_cd = cmpy_cd;
		this.dstb_rat_cd = dstb_rat_cd;
		this.dstb_rat_nm = dstb_rat_nm;
		this.basi = basi;
		this.calc_styl = calc_styl;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRow(String row){
		this.row = row;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDstb_rat_cd(String dstb_rat_cd){
		this.dstb_rat_cd = dstb_rat_cd;
	}

	public void setDstb_rat_nm(String dstb_rat_nm){
		this.dstb_rat_nm = dstb_rat_nm;
	}

	public void setBasi(String basi){
		this.basi = basi;
	}

	public void setCalc_styl(String calc_styl){
		this.calc_styl = calc_styl;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getRow(){
		return this.row;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDstb_rat_cd(){
		return this.dstb_rat_cd;
	}

	public String getDstb_rat_nm(){
		return this.dstb_rat_nm;
	}

	public String getBasi(){
		return this.basi;
	}

	public String getCalc_styl(){
		return this.calc_styl;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_CLOSE_4001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_CLOSE_4001_ADM dm = (MT_CLOSE_4001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.row);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.dstb_rat_cd);
		cstmt.setString(7, dm.dstb_rat_nm);
		cstmt.setString(8, dm.basi);
		cstmt.setString(9, dm.calc_styl);
		cstmt.setString(10, dm.incmg_pers_ipaddr);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.close.ds.MT_CLOSE_4001_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("row = " + getRow());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dstb_rat_cd = " + getDstb_rat_cd());
        System.out.println("dstb_rat_nm = " + getDstb_rat_nm());
        System.out.println("basi = " + getBasi());
        System.out.println("calc_styl = " + getCalc_styl());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String row = req.getParameter("row");
if( row == null){
	System.out.println(this.toString+" : row is null" );
}else{
	System.out.println(this.toString+" : row is "+row );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dstb_rat_cd = req.getParameter("dstb_rat_cd");
if( dstb_rat_cd == null){
	System.out.println(this.toString+" : dstb_rat_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_rat_cd is "+dstb_rat_cd );
}
String dstb_rat_nm = req.getParameter("dstb_rat_nm");
if( dstb_rat_nm == null){
	System.out.println(this.toString+" : dstb_rat_nm is null" );
}else{
	System.out.println(this.toString+" : dstb_rat_nm is "+dstb_rat_nm );
}
String basi = req.getParameter("basi");
if( basi == null){
	System.out.println(this.toString+" : basi is null" );
}else{
	System.out.println(this.toString+" : basi is "+basi );
}
String calc_styl = req.getParameter("calc_styl");
if( calc_styl == null){
	System.out.println(this.toString+" : calc_styl is null" );
}else{
	System.out.println(this.toString+" : calc_styl is "+calc_styl );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String row = Util.checkString(req.getParameter("row"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dstb_rat_cd = Util.checkString(req.getParameter("dstb_rat_cd"));
String dstb_rat_nm = Util.checkString(req.getParameter("dstb_rat_nm"));
String basi = Util.checkString(req.getParameter("basi"));
String calc_styl = Util.checkString(req.getParameter("calc_styl"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String row = Util.Uni2Ksc(Util.checkString(req.getParameter("row")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dstb_rat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_rat_cd")));
String dstb_rat_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_rat_nm")));
String basi = Util.Uni2Ksc(Util.checkString(req.getParameter("basi")));
String calc_styl = Util.Uni2Ksc(Util.checkString(req.getParameter("calc_styl")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setRow(row);
dm.setCmpy_cd(cmpy_cd);
dm.setDstb_rat_cd(dstb_rat_cd);
dm.setDstb_rat_nm(dstb_rat_nm);
dm.setBasi(basi);
dm.setCalc_styl(calc_styl);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 09:51:53 KST 2009 */