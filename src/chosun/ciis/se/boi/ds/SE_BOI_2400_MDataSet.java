/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.boi.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_2400_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList area_cdcur = new ArrayList();
	public ArrayList team_cdcur = new ArrayList();
	public ArrayList part_cdcur = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rcpm_yymm;

	public SE_BOI_2400_MDataSet(){}
	public SE_BOI_2400_MDataSet(String errcode, String errmsg, String rcpm_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rcpm_yymm = rcpm_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRcpm_yymm(String rcpm_yymm){
		this.rcpm_yymm = rcpm_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRcpm_yymm(){
		return this.rcpm_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rcpm_yymm = Util.checkString(cstmt.getString(5));
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			SE_BOI_2400_MTEAM_CDCURRecord rec = new SE_BOI_2400_MTEAM_CDCURRecord();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.team_cdcur.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			SE_BOI_2400_MPART_CDCURRecord rec = new SE_BOI_2400_MPART_CDCURRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset1.getString("dept_nm"));
			rec.supr_dept_cd = Util.checkString(rset1.getString("supr_dept_cd"));
			this.part_cdcur.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			SE_BOI_2400_MAREA_CDCURRecord rec = new SE_BOI_2400_MAREA_CDCURRecord();
			rec.area_cd = Util.checkString(rset2.getString("area_cd"));
			rec.area_nm = Util.checkString(rset2.getString("area_nm"));
			rec.dept_cd = Util.checkString(rset2.getString("dept_cd"));
			rec.supr_dept_cd = Util.checkString(rset2.getString("supr_dept_cd"));
			this.area_cdcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SE_BOI_2400_MDataSet ds = (SE_BOI_2400_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.team_cdcur.size(); i++){
		SE_BOI_2400_MTEAM_CDCURRecord team_cdcurRec = (SE_BOI_2400_MTEAM_CDCURRecord)ds.team_cdcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.part_cdcur.size(); i++){
		SE_BOI_2400_MPART_CDCURRecord part_cdcurRec = (SE_BOI_2400_MPART_CDCURRecord)ds.part_cdcur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.area_cdcur.size(); i++){
		SE_BOI_2400_MAREA_CDCURRecord area_cdcurRec = (SE_BOI_2400_MAREA_CDCURRecord)ds.area_cdcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpm_yymm()%>
<%= ds.getTeam_cdcur()%>
<%= ds.getPart_cdcur()%>
<%= ds.getArea_cdcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= team_cdcurRec.dept_cd%>
<%= team_cdcurRec.dept_nm%>
<%= part_cdcurRec.dept_cd%>
<%= part_cdcurRec.dept_nm%>
<%= part_cdcurRec.supr_dept_cd%>
<%= area_cdcurRec.area_cd%>
<%= area_cdcurRec.area_nm%>
<%= area_cdcurRec.dept_cd%>
<%= area_cdcurRec.supr_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 28 11:39:50 KST 2009 */