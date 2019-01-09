/***************************************************************************************************
* 파일명 : SS_L_INFOEXG_SRCHDataSet.java
* 기능 : 정보공유-공지사항,게시판-목록을 위한 DataSet
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.share.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-공지사항,게시판-목록을 위한 DataSet
 */

public class SS_L_INFOEXG_SRCHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList buseolist = new ArrayList();
	public ArrayList infoexglist = new ArrayList();
	public ArrayList rmsgexttcd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String rmsgareanm_param;
	public long totalcnt;

	public SS_L_INFOEXG_SRCHDataSet(){}
	public SS_L_INFOEXG_SRCHDataSet(String errcode, String errmsg, String rmsgareanm_param, long totalcnt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.rmsgareanm_param = rmsgareanm_param;
		this.totalcnt = totalcnt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRmsgareanm_param(String rmsgareanm_param){
		this.rmsgareanm_param = rmsgareanm_param;
	}

	public void setTotalcnt(long totalcnt){
		this.totalcnt = totalcnt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRmsgareanm_param(){
		return this.rmsgareanm_param;
	}

	public long getTotalcnt(){
		return this.totalcnt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rmsgareanm_param = Util.checkString(cstmt.getString(19));
		this.totalcnt = cstmt.getLong(20);
		ResultSet rset0 = (ResultSet) cstmt.getObject(21);
		while(rset0.next()){
			SS_L_INFOEXG_SRCHINFOEXGLISTRecord rec = new SS_L_INFOEXG_SRCHINFOEXGLISTRecord();
			rec.seq = rset0.getInt("seq");
			rec.clsf = Util.checkString(rset0.getString("clsf"));
			rec.answergrp = rset0.getInt("answergrp");
			rec.answerseq = rset0.getInt("answerseq");
			rec.answerlevl = rset0.getInt("answerlevl");
			rec.notifrdt = Util.checkString(rset0.getString("notifrdt"));
			rec.notitodt = Util.checkString(rset0.getString("notitodt"));
			rec.regdt = rset0.getTimestamp("regdt");
			rec.upddt = rset0.getTimestamp("upddt");
			rec.makepersid = Util.checkString(rset0.getString("makepersid"));
			rec.makepersnm = Util.checkString(rset0.getString("makepersnm"));
			rec.titl = Util.checkString(rset0.getString("titl"));
			rec.brwscnt = rset0.getInt("brwscnt");
			rec.recomcnt = rset0.getInt("recomcnt");
			rec.dwloadcnt = rset0.getInt("dwloadcnt");
			rec.deptcd = Util.checkString(rset0.getString("deptcd"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.rmsgdept = Util.checkString(rset0.getString("rmsgdept"));
			rec.rmsgarea = Util.checkString(rset0.getString("rmsgarea"));
			rec.rmsgexttcd = Util.checkString(rset0.getString("rmsgexttcd"));
			rec.filenm = Util.checkString(rset0.getString("filenm"));
			rec.filesize = Util.checkString(rset0.getString("filesize"));
			this.infoexglist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(22);
		while(rset1.next()){
			SS_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord rec = new SS_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord();
			rec.cicodeval = Util.checkString(rset1.getString("cicodeval"));
			rec.cicdnm = Util.checkString(rset1.getString("cicdnm"));
			this.rmsgexttcd_list.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(23);
		while(rset2.next()){
			SS_L_INFOEXG_SRCHBUSEOLISTRecord rec = new SS_L_INFOEXG_SRCHBUSEOLISTRecord();
			rec.deptcd = Util.checkString(rset2.getString("deptcd"));
			rec.boksnm = Util.checkString(rset2.getString("boksnm"));
			this.buseolist.add(rec);
		}
	}


	public String buseolistOptHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SRCHBUSEOLISTRecord rec = (SS_L_INFOEXG_SRCHBUSEOLISTRecord)buseolist.get(i);


			String code = rec.deptcd;
			String name = rec.boksnm;

			sb.append("<option value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" selected ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</option>");
		}
		return sb.toString();
	}


	public String buseolistChkHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SRCHBUSEOLISTRecord rec = (SS_L_INFOEXG_SRCHBUSEOLISTRecord)buseolist.get(i);


			String code = rec.deptcd;
			String name = rec.boksnm;

			sb.append("<input name=\"");
			sb.append("deptcd");
			sb.append("\" type=\"checkbox\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}


	public String buseolistRdoHtml(String selected){
		StringBuffer sb = new StringBuffer("");
		int size = buseolist.size();
		for(int i=0; i<size; i++){
			SS_L_INFOEXG_SRCHBUSEOLISTRecord rec = (SS_L_INFOEXG_SRCHBUSEOLISTRecord)buseolist.get(i);


			String code = rec.deptcd;
			String name = rec.boksnm;

			sb.append("<input name=\"");
			sb.append("deptcd");
			sb.append("\" type=\"radio\" value=\"");
			sb.append(code);
			sb.append("\"");
			if(code.equals(selected)){
				sb.append(" checked ");
			}
			sb.append(">");
			sb.append(name);
			sb.append("</input>");
		}
		return sb.toString();
	}

    public String rmsgexttcd_listOptHtml(String selected){
        StringBuffer sb = new StringBuffer("");
        int size = rmsgexttcd_list.size();
        for(int i=0; i<size; i++){
            SS_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord rec = (SS_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord)rmsgexttcd_list.get(i);


            String code = rec.cicodeval;
            String name = rec.cicdnm;

            sb.append("<option value=\"");
            sb.append(code);
            sb.append("\"");
            if(code.equals(selected)){
                sb.append(" selected ");
            }
            sb.append(">");
            sb.append(name);
            sb.append("</option>");
        }
        return sb.toString();
    }

}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_INFOEXG_SRCHDataSet ds = (SS_L_INFOEXG_SRCHDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.infoexglist.size(); i++){
		SS_L_INFOEXG_SRCHINFOEXGLISTRecord infoexglistRec = (SS_L_INFOEXG_SRCHINFOEXGLISTRecord)ds.infoexglist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.rmsgexttcd_list.size(); i++){
		SS_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord rmsgexttcd_listRec = (SS_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord)ds.rmsgexttcd_list.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.buseolist.size(); i++){
		SS_L_INFOEXG_SRCHBUSEOLISTRecord buseolistRec = (SS_L_INFOEXG_SRCHBUSEOLISTRecord)ds.buseolist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRmsgareanm_param()%>
<%= ds.getTotalcnt()%>
<%= ds.getInfoexglist()%>
<%= ds.getRmsgexttcd_list()%>
<%= ds.getBuseolist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= infoexglistRec.seq%>
<%= infoexglistRec.clsf%>
<%= infoexglistRec.answergrp%>
<%= infoexglistRec.answerseq%>
<%= infoexglistRec.answerlevl%>
<%= infoexglistRec.notifrdt%>
<%= infoexglistRec.notitodt%>
<%= infoexglistRec.regdt%>
<%= infoexglistRec.upddt%>
<%= infoexglistRec.makepersid%>
<%= infoexglistRec.makepersnm%>
<%= infoexglistRec.titl%>
<%= infoexglistRec.brwscnt%>
<%= infoexglistRec.recomcnt%>
<%= infoexglistRec.dwloadcnt%>
<%= infoexglistRec.deptcd%>
<%= infoexglistRec.deptnm%>
<%= infoexglistRec.rmsgdept%>
<%= infoexglistRec.rmsgarea%>
<%= infoexglistRec.rmsgexttcd%>
<%= infoexglistRec.filenm%>
<%= infoexglistRec.filesize%>
<%= rmsgexttcd_listRec.cicodeval%>
<%= rmsgexttcd_listRec.cicdnm%>
<%= buseolistRec.deptcd%>
<%= buseolistRec.boksnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 09 19:32:14 KST 2004 */