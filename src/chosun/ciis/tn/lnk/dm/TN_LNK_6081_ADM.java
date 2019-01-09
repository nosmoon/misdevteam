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


public class TN_LNK_6081_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sdsiidx;
	public String sdsiclsf;
	public String seq;
	public String filedata;
	public String incmg_pers;

	public TN_LNK_6081_ADM(){}
	public TN_LNK_6081_ADM(String sdsiidx, String sdsiclsf, String seq, String filedata, String incmg_pers){
		this.sdsiidx = sdsiidx;
		this.sdsiclsf = sdsiclsf;
		this.seq = seq;
		this.filedata = filedata;
		this.incmg_pers = incmg_pers;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public void setSdsiclsf(String sdsiclsf){
		this.sdsiclsf = sdsiclsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFiledata(String filedata){
		this.filedata = filedata;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}

	public String getSdsiclsf(){
		return this.sdsiclsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFiledata(){
		return this.filedata;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_6081_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_6081_ADM dm = (TN_LNK_6081_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sdsiidx);
		cstmt.setString(4, dm.sdsiclsf);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.filedata);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_6081_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("sdsiidx = [" + getSdsiidx() + "]");
		System.out.println("sdsiclsf = [" + getSdsiclsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("filedata = [" + getFiledata() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String sdsiidx = req.getParameter("sdsiidx");
if( sdsiidx == null){
	System.out.println(this.toString+" : sdsiidx is null" );
}else{
	System.out.println(this.toString+" : sdsiidx is "+sdsiidx );
}
String sdsiclsf = req.getParameter("sdsiclsf");
if( sdsiclsf == null){
	System.out.println(this.toString+" : sdsiclsf is null" );
}else{
	System.out.println(this.toString+" : sdsiclsf is "+sdsiclsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String filedata = req.getParameter("filedata");
if( filedata == null){
	System.out.println(this.toString+" : filedata is null" );
}else{
	System.out.println(this.toString+" : filedata is "+filedata );
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

String sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
String sdsiclsf = Util.checkString(req.getParameter("sdsiclsf"));
String seq = Util.checkString(req.getParameter("seq"));
String filedata = Util.checkString(req.getParameter("filedata"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String sdsiidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiidx")));
String sdsiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiclsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String filedata = Util.Uni2Ksc(Util.checkString(req.getParameter("filedata")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSdsiidx(sdsiidx);
dm.setSdsiclsf(sdsiclsf);
dm.setSeq(seq);
dm.setFiledata(filedata);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 09 13:45:06 KST 2016 */