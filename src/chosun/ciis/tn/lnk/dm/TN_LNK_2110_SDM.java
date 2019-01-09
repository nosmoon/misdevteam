/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2110_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String deptidx;
	public String organcode;
	public String organpayaccount;
	public String organrootaccount;
	public String description;
	public String uselink;
	public String linktest;
	public String aplcfile_path;
	public String payfile_path;
	public String paydate;
	public String chg_pers;

	public TN_LNK_2110_SDM(){}
	public TN_LNK_2110_SDM(String cmpy_cd, String deptidx, String organcode, String organpayaccount, String organrootaccount, String description, String uselink, String linktest, String aplcfile_path, String payfile_path, String paydate, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.deptidx = deptidx;
		this.organcode = organcode;
		this.organpayaccount = organpayaccount;
		this.organrootaccount = organrootaccount;
		this.description = description;
		this.uselink = uselink;
		this.linktest = linktest;
		this.aplcfile_path = aplcfile_path;
		this.payfile_path = payfile_path;
		this.paydate = paydate;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDeptidx(String deptidx){
		this.deptidx = deptidx;
	}

	public void setOrgancode(String organcode){
		this.organcode = organcode;
	}

	public void setOrganpayaccount(String organpayaccount){
		this.organpayaccount = organpayaccount;
	}

	public void setOrganrootaccount(String organrootaccount){
		this.organrootaccount = organrootaccount;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setUselink(String uselink){
		this.uselink = uselink;
	}

	public void setLinktest(String linktest){
		this.linktest = linktest;
	}

	public void setAplcfile_path(String aplcfile_path){
		this.aplcfile_path = aplcfile_path;
	}

	public void setPayfile_path(String payfile_path){
		this.payfile_path = payfile_path;
	}

	public void setPaydate(String paydate){
		this.paydate = paydate;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDeptidx(){
		return this.deptidx;
	}

	public String getOrgancode(){
		return this.organcode;
	}

	public String getOrganpayaccount(){
		return this.organpayaccount;
	}

	public String getOrganrootaccount(){
		return this.organrootaccount;
	}

	public String getDescription(){
		return this.description;
	}

	public String getUselink(){
		return this.uselink;
	}

	public String getLinktest(){
		return this.linktest;
	}

	public String getAplcfile_path(){
		return this.aplcfile_path;
	}

	public String getPayfile_path(){
		return this.payfile_path;
	}

	public String getPaydate(){
		return this.paydate;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_2110_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_2110_SDM dm = (TN_LNK_2110_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deptidx);
		cstmt.setString(5, dm.organcode);
		cstmt.setString(6, dm.organpayaccount);
		cstmt.setString(7, dm.organrootaccount);
		cstmt.setString(8, dm.description);
		cstmt.setString(9, dm.uselink);
		cstmt.setString(10, dm.linktest);
		cstmt.setString(11, dm.aplcfile_path);
		cstmt.setString(12, dm.payfile_path);
		cstmt.setString(13, dm.paydate);
		cstmt.setString(14, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_2110_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("organcode = [" + getOrgancode() + "]");
		System.out.println("organpayaccount = [" + getOrganpayaccount() + "]");
		System.out.println("organrootaccount = [" + getOrganrootaccount() + "]");
		System.out.println("description = [" + getDescription() + "]");
		System.out.println("uselink = [" + getUselink() + "]");
		System.out.println("linktest = [" + getLinktest() + "]");
		System.out.println("aplcfile_path = [" + getAplcfile_path() + "]");
		System.out.println("payfile_path = [" + getPayfile_path() + "]");
		System.out.println("paydate = [" + getPaydate() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String deptidx = req.getParameter("deptidx");
if( deptidx == null){
	System.out.println(this.toString+" : deptidx is null" );
}else{
	System.out.println(this.toString+" : deptidx is "+deptidx );
}
String organcode = req.getParameter("organcode");
if( organcode == null){
	System.out.println(this.toString+" : organcode is null" );
}else{
	System.out.println(this.toString+" : organcode is "+organcode );
}
String organpayaccount = req.getParameter("organpayaccount");
if( organpayaccount == null){
	System.out.println(this.toString+" : organpayaccount is null" );
}else{
	System.out.println(this.toString+" : organpayaccount is "+organpayaccount );
}
String organrootaccount = req.getParameter("organrootaccount");
if( organrootaccount == null){
	System.out.println(this.toString+" : organrootaccount is null" );
}else{
	System.out.println(this.toString+" : organrootaccount is "+organrootaccount );
}
String description = req.getParameter("description");
if( description == null){
	System.out.println(this.toString+" : description is null" );
}else{
	System.out.println(this.toString+" : description is "+description );
}
String uselink = req.getParameter("uselink");
if( uselink == null){
	System.out.println(this.toString+" : uselink is null" );
}else{
	System.out.println(this.toString+" : uselink is "+uselink );
}
String linktest = req.getParameter("linktest");
if( linktest == null){
	System.out.println(this.toString+" : linktest is null" );
}else{
	System.out.println(this.toString+" : linktest is "+linktest );
}
String aplcfile_path = req.getParameter("aplcfile_path");
if( aplcfile_path == null){
	System.out.println(this.toString+" : aplcfile_path is null" );
}else{
	System.out.println(this.toString+" : aplcfile_path is "+aplcfile_path );
}
String payfile_path = req.getParameter("payfile_path");
if( payfile_path == null){
	System.out.println(this.toString+" : payfile_path is null" );
}else{
	System.out.println(this.toString+" : payfile_path is "+payfile_path );
}
String paydate = req.getParameter("paydate");
if( paydate == null){
	System.out.println(this.toString+" : paydate is null" );
}else{
	System.out.println(this.toString+" : paydate is "+paydate );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String deptidx = Util.checkString(req.getParameter("deptidx"));
String organcode = Util.checkString(req.getParameter("organcode"));
String organpayaccount = Util.checkString(req.getParameter("organpayaccount"));
String organrootaccount = Util.checkString(req.getParameter("organrootaccount"));
String description = Util.checkString(req.getParameter("description"));
String uselink = Util.checkString(req.getParameter("uselink"));
String linktest = Util.checkString(req.getParameter("linktest"));
String aplcfile_path = Util.checkString(req.getParameter("aplcfile_path"));
String payfile_path = Util.checkString(req.getParameter("payfile_path"));
String paydate = Util.checkString(req.getParameter("paydate"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String deptidx = Util.Uni2Ksc(Util.checkString(req.getParameter("deptidx")));
String organcode = Util.Uni2Ksc(Util.checkString(req.getParameter("organcode")));
String organpayaccount = Util.Uni2Ksc(Util.checkString(req.getParameter("organpayaccount")));
String organrootaccount = Util.Uni2Ksc(Util.checkString(req.getParameter("organrootaccount")));
String description = Util.Uni2Ksc(Util.checkString(req.getParameter("description")));
String uselink = Util.Uni2Ksc(Util.checkString(req.getParameter("uselink")));
String linktest = Util.Uni2Ksc(Util.checkString(req.getParameter("linktest")));
String aplcfile_path = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcfile_path")));
String payfile_path = Util.Uni2Ksc(Util.checkString(req.getParameter("payfile_path")));
String paydate = Util.Uni2Ksc(Util.checkString(req.getParameter("paydate")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDeptidx(deptidx);
dm.setOrgancode(organcode);
dm.setOrganpayaccount(organpayaccount);
dm.setOrganrootaccount(organrootaccount);
dm.setDescription(description);
dm.setUselink(uselink);
dm.setLinktest(linktest);
dm.setAplcfile_path(aplcfile_path);
dm.setPayfile_path(payfile_path);
dm.setPaydate(paydate);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 19 19:18:32 KST 2016 */