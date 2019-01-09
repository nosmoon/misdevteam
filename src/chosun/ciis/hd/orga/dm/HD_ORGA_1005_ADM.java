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


package chosun.ciis.hd.orga.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.ds.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1005_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String dept_cd;
	public String dept_nm;
	public String seq;
	public String pre_dept_cd;
	public String pre_dept_nm;
	public String chg_aft_dept_cd;
	public String chg_aft_dept_nm;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_ORGA_1005_ADM(){}
	public HD_ORGA_1005_ADM(String mode, String cmpy_cd, String dept_cd, String dept_nm, String seq, String pre_dept_cd, String pre_dept_nm, String chg_aft_dept_cd, String chg_aft_dept_nm, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.seq = seq;
		this.pre_dept_cd = pre_dept_cd;
		this.pre_dept_nm = pre_dept_nm;
		this.chg_aft_dept_cd = chg_aft_dept_cd;
		this.chg_aft_dept_nm = chg_aft_dept_nm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPre_dept_cd(String pre_dept_cd){
		this.pre_dept_cd = pre_dept_cd;
	}

	public void setPre_dept_nm(String pre_dept_nm){
		this.pre_dept_nm = pre_dept_nm;
	}

	public void setChg_aft_dept_cd(String chg_aft_dept_cd){
		this.chg_aft_dept_cd = chg_aft_dept_cd;
	}

	public void setChg_aft_dept_nm(String chg_aft_dept_nm){
		this.chg_aft_dept_nm = chg_aft_dept_nm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getPre_dept_cd(){
		return this.pre_dept_cd;
	}

	public String getPre_dept_nm(){
		return this.pre_dept_nm;
	}

	public String getChg_aft_dept_cd(){
		return this.chg_aft_dept_cd;
	}

	public String getChg_aft_dept_nm(){
		return this.chg_aft_dept_nm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_ORGA_1005_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_ORGA_1005_ADM dm = (HD_ORGA_1005_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.dept_nm);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.pre_dept_cd);
		cstmt.setString(9, dm.pre_dept_nm);
		cstmt.setString(10, dm.chg_aft_dept_cd);
		cstmt.setString(11, dm.chg_aft_dept_nm);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.orga.ds.HD_ORGA_1005_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("dept_nm = " + getDept_nm());
        System.out.println("seq = " + getSeq());
        System.out.println("pre_dept_cd = " + getPre_dept_cd());
        System.out.println("pre_dept_nm = " + getPre_dept_nm());
        System.out.println("chg_aft_dept_cd = " + getChg_aft_dept_cd());
        System.out.println("chg_aft_dept_nm = " + getChg_aft_dept_nm());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
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
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String pre_dept_cd = req.getParameter("pre_dept_cd");
if( pre_dept_cd == null){
	System.out.println(this.toString+" : pre_dept_cd is null" );
}else{
	System.out.println(this.toString+" : pre_dept_cd is "+pre_dept_cd );
}
String pre_dept_nm = req.getParameter("pre_dept_nm");
if( pre_dept_nm == null){
	System.out.println(this.toString+" : pre_dept_nm is null" );
}else{
	System.out.println(this.toString+" : pre_dept_nm is "+pre_dept_nm );
}
String chg_aft_dept_cd = req.getParameter("chg_aft_dept_cd");
if( chg_aft_dept_cd == null){
	System.out.println(this.toString+" : chg_aft_dept_cd is null" );
}else{
	System.out.println(this.toString+" : chg_aft_dept_cd is "+chg_aft_dept_cd );
}
String chg_aft_dept_nm = req.getParameter("chg_aft_dept_nm");
if( chg_aft_dept_nm == null){
	System.out.println(this.toString+" : chg_aft_dept_nm is null" );
}else{
	System.out.println(this.toString+" : chg_aft_dept_nm is "+chg_aft_dept_nm );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String seq = Util.checkString(req.getParameter("seq"));
String pre_dept_cd = Util.checkString(req.getParameter("pre_dept_cd"));
String pre_dept_nm = Util.checkString(req.getParameter("pre_dept_nm"));
String chg_aft_dept_cd = Util.checkString(req.getParameter("chg_aft_dept_cd"));
String chg_aft_dept_nm = Util.checkString(req.getParameter("chg_aft_dept_nm"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String pre_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_dept_cd")));
String pre_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_dept_nm")));
String chg_aft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_aft_dept_cd")));
String chg_aft_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_aft_dept_nm")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setSeq(seq);
dm.setPre_dept_cd(pre_dept_cd);
dm.setPre_dept_nm(pre_dept_nm);
dm.setChg_aft_dept_cd(chg_aft_dept_cd);
dm.setChg_aft_dept_nm(chg_aft_dept_nm);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 16:34:23 KST 2009 */