/***************************************************************************************************
 * ���ϸ�   : SP_CO_S_CDV
 * ���     : ������-�����ڵ�
 * �ۼ����� : 2008/04/10
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
**  SP_CO_S_CDV
**/

public class CO_S_CDVDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;

	public CO_S_CDVDM(){}
	public CO_S_CDVDM(String ciymgbcd, String cicdgb, String cicodeval){
		this.ciymgbcd = ciymgbcd;
		this.cicdgb = cicdgb;
		this.cicodeval = cicodeval;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getSQL(){
		 return "{ call SP_CO_S_CDV( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_S_CDVDM dm = (CO_S_CDVDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ciymgbcd);
		cstmt.setString(4, dm.cicdgb);
		cstmt.setString(5, dm.cicodeval);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.CO_S_CDVDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String ciymgbcd = req.getParameter("ciymgbcd");
if( ciymgbcd == null){
	System.out.println(this.toString+" : ciymgbcd is null" );
}else{
	System.out.println(this.toString+" : ciymgbcd is "+ciymgbcd );
}
String cicdgb = req.getParameter("cicdgb");
if( cicdgb == null){
	System.out.println(this.toString+" : cicdgb is null" );
}else{
	System.out.println(this.toString+" : cicdgb is "+cicdgb );
}
String cicodeval = req.getParameter("cicodeval");
if( cicodeval == null){
	System.out.println(this.toString+" : cicodeval is null" );
}else{
	System.out.println(this.toString+" : cicodeval is "+cicodeval );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
String cicdgb = Util.checkString(req.getParameter("cicdgb"));
String cicodeval = Util.checkString(req.getParameter("cicodeval"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String ciymgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ciymgbcd")));
String cicdgb = Util.Uni2Ksc(Util.checkString(req.getParameter("cicdgb")));
String cicodeval = Util.Uni2Ksc(Util.checkString(req.getParameter("cicodeval")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCiymgbcd(ciymgbcd);
dm.setCicdgb(cicdgb);
dm.setCicodeval(cicodeval);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 10 18:01:35 KST 2008 */