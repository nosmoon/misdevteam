/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EMP_NWSPRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cntrno;
	public String cmpycd;
	public String empnm;
	public String subsyn;

	public SS_L_EMP_NWSPRDRDM(){}
	public SS_L_EMP_NWSPRDRDM(String cntrno, String cmpycd, String empnm, String subsyn){
		this.cntrno = cntrno;
		this.cmpycd = cmpycd;
		this.empnm = empnm;
		this.subsyn = subsyn;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setSubsyn(String subsyn){
		this.subsyn = subsyn;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getSubsyn(){
		return this.subsyn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_EMP_NWSPRDR(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EMP_NWSPRDRDM dm = (SS_L_EMP_NWSPRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cntrno);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.empnm);
		cstmt.setString(6, dm.subsyn);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EMP_NWSPRDRDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cntrno = [" + getCntrno() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("empnm = [" + getEmpnm() + "]");
		System.out.println("subsyn = [" + getSubsyn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String empnm = req.getParameter("empnm");
if( empnm == null){
	System.out.println(this.toString+" : empnm is null" );
}else{
	System.out.println(this.toString+" : empnm is "+empnm );
}
String subsyn = req.getParameter("subsyn");
if( subsyn == null){
	System.out.println(this.toString+" : subsyn is null" );
}else{
	System.out.println(this.toString+" : subsyn is "+subsyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cntrno = Util.checkString(req.getParameter("cntrno"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String empnm = Util.checkString(req.getParameter("empnm"));
String subsyn = Util.checkString(req.getParameter("subsyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCntrno(cntrno);
dm.setCmpycd(cmpycd);
dm.setEmpnm(empnm);
dm.setSubsyn(subsyn);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Mar 11 05:55:55 GMT 2013 */