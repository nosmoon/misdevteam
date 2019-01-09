/***************************************************************************************************
* ���ϸ� : .java
* ��� : 	   
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class TN_LNK_6035_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String file_clsf;
	public String pymtmm;
	public String pymtdd;
	public String promiseidx;
	public String incmg_pers_addr;
	public String incmg_pers;

	public TN_LNK_6035_ADM(){}
	public TN_LNK_6035_ADM(String cmpy_cd, String file_clsf, String pymtmm, String pymtdd, String promiseidx, String incmg_pers_addr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.file_clsf = file_clsf;
		this.pymtmm = pymtmm;
		this.pymtdd = pymtdd;
		this.promiseidx = promiseidx;
		this.incmg_pers_addr = incmg_pers_addr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFile_clsf(String file_clsf){
		this.file_clsf = file_clsf;
	}

	public void setPymtmm(String pymtmm){
		this.pymtmm = pymtmm;
	}

	public void setPymtdd(String pymtdd){
		this.pymtdd = pymtdd;
	}

	public void setPromiseidx(String promiseidx){
		this.promiseidx = promiseidx;
	}

	public void setIncmg_pers_addr(String incmg_pers_addr){
		this.incmg_pers_addr = incmg_pers_addr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFile_clsf(){
		return this.file_clsf;
	}

	public String getPymtmm(){
		return this.pymtmm;
	}

	public String getPymtdd(){
		return this.pymtdd;
	}

	public String getPromiseidx(){
		return this.promiseidx;
	}

	public String getIncmg_pers_addr(){
		return this.incmg_pers_addr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_6035_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_6035_ADM dm = (TN_LNK_6035_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.file_clsf);
		cstmt.setString(5, dm.pymtmm);
		cstmt.setString(6, dm.pymtdd);
		cstmt.setString(7, dm.promiseidx);
		cstmt.setString(8, dm.incmg_pers_addr);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_6035_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("file_clsf = [" + getFile_clsf() + "]");
		System.out.println("pymtmm = [" + getPymtmm() + "]");
		System.out.println("pymtdd = [" + getPymtdd() + "]");
		System.out.println("promiseidx = [" + getPromiseidx() + "]");
		System.out.println("incmg_pers_addr = [" + getIncmg_pers_addr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String file_clsf = req.getParameter("file_clsf");
if( file_clsf == null){
	System.out.println(this.toString+" : file_clsf is null" );
}else{
	System.out.println(this.toString+" : file_clsf is "+file_clsf );
}
String pymtmm = req.getParameter("pymtmm");
if( pymtmm == null){
	System.out.println(this.toString+" : pymtmm is null" );
}else{
	System.out.println(this.toString+" : pymtmm is "+pymtmm );
}
String pymtdd = req.getParameter("pymtdd");
if( pymtdd == null){
	System.out.println(this.toString+" : pymtdd is null" );
}else{
	System.out.println(this.toString+" : pymtdd is "+pymtdd );
}
String promiseidx = req.getParameter("promiseidx");
if( promiseidx == null){
	System.out.println(this.toString+" : promiseidx is null" );
}else{
	System.out.println(this.toString+" : promiseidx is "+promiseidx );
}
String incmg_pers_addr = req.getParameter("incmg_pers_addr");
if( incmg_pers_addr == null){
	System.out.println(this.toString+" : incmg_pers_addr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_addr is "+incmg_pers_addr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String file_clsf = Util.checkString(req.getParameter("file_clsf"));
String pymtmm = Util.checkString(req.getParameter("pymtmm"));
String pymtdd = Util.checkString(req.getParameter("pymtdd"));
String promiseidx = Util.checkString(req.getParameter("promiseidx"));
String incmg_pers_addr = Util.checkString(req.getParameter("incmg_pers_addr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String file_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("file_clsf")));
String pymtmm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtmm")));
String pymtdd = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtdd")));
String promiseidx = Util.Uni2Ksc(Util.checkString(req.getParameter("promiseidx")));
String incmg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_addr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFile_clsf(file_clsf);
dm.setPymtmm(pymtmm);
dm.setPymtdd(pymtdd);
dm.setPromiseidx(promiseidx);
dm.setIncmg_pers_addr(incmg_pers_addr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Nov 07 15:00:55 KST 2016 */