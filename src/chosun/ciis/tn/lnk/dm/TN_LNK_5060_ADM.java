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


public class TN_LNK_5060_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sdsiidx;
	public String requestdate;
	public String fmsseq;

	public TN_LNK_5060_ADM(){}
	public TN_LNK_5060_ADM(String cmpy_cd, String sdsiidx, String requestdate, String fmsseq){
		this.cmpy_cd = cmpy_cd;
		this.sdsiidx = sdsiidx;
		this.requestdate = requestdate;
		this.fmsseq = fmsseq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSdsiidx(String sdsiidx){
		this.sdsiidx = sdsiidx;
	}

	public void setRequestdate(String requestdate){
		this.requestdate = requestdate;
	}

	public void setFmsseq(String fmsseq){
		this.fmsseq = fmsseq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSdsiidx(){
		return this.sdsiidx;
	}

	public String getRequestdate(){
		return this.requestdate;
	}

	public String getFmsseq(){
		return this.fmsseq;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_5060_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_5060_ADM dm = (TN_LNK_5060_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sdsiidx);
		cstmt.setString(5, dm.requestdate);
		cstmt.setString(6, dm.fmsseq);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_5060_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sdsiidx = [" + getSdsiidx() + "]");
		System.out.println("requestdate = [" + getRequestdate() + "]");
		System.out.println("fmsseq = [" + getFmsseq() + "]");
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
String sdsiidx = req.getParameter("sdsiidx");
if( sdsiidx == null){
	System.out.println(this.toString+" : sdsiidx is null" );
}else{
	System.out.println(this.toString+" : sdsiidx is "+sdsiidx );
}
String requestdate = req.getParameter("requestdate");
if( requestdate == null){
	System.out.println(this.toString+" : requestdate is null" );
}else{
	System.out.println(this.toString+" : requestdate is "+requestdate );
}
String fmsseq = req.getParameter("fmsseq");
if( fmsseq == null){
	System.out.println(this.toString+" : fmsseq is null" );
}else{
	System.out.println(this.toString+" : fmsseq is "+fmsseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sdsiidx = Util.checkString(req.getParameter("sdsiidx"));
String requestdate = Util.checkString(req.getParameter("requestdate"));
String fmsseq = Util.checkString(req.getParameter("fmsseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sdsiidx = Util.Uni2Ksc(Util.checkString(req.getParameter("sdsiidx")));
String requestdate = Util.Uni2Ksc(Util.checkString(req.getParameter("requestdate")));
String fmsseq = Util.Uni2Ksc(Util.checkString(req.getParameter("fmsseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setSdsiidx(sdsiidx);
dm.setRequestdate(requestdate);
dm.setFmsseq(fmsseq);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Nov 02 16:06:50 KST 2016 */