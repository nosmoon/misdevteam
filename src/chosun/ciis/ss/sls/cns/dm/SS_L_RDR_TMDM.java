/***************************************************************************************************
* ���ϸ� : SS_L_RDR_TMDM.java
* ��� : ����-���ǵ��ڰ˻��� ���� DM
* �ۼ����� : 2004-04-24
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 * ����-���ǵ��ڰ˻��� ���� DM
 */


public class SS_L_RDR_TMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String medicd;
	public String rdrnm;

	public SS_L_RDR_TMDM(){}
	public SS_L_RDR_TMDM(String incmgpers, String medicd, String rdrnm){
		this.incmgpers = incmgpers;
		this.medicd = medicd;
		this.rdrnm = rdrnm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_TM( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_TMDM dm = (SS_L_RDR_TMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.rdrnm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.cns.ds.SS_L_RDR_TMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String medicd = Util.checkString(req.getParameter("medicd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setIncmgpers(incmgpers);
dm.setMedicd(medicd);
dm.setRdrnm(rdrnm);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jul 14 11:10:46 KST 2004 */