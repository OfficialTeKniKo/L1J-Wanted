package l1j.server.web.dispatcher.response.define;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Map;

import l1j.server.web.dispatcher.DispatcherModel;
import l1j.server.web.dispatcher.response.content.ContentCommentVO;
import l1j.server.web.dispatcher.response.content.ContentDAO;
import l1j.server.web.http.HttpJsonModel;
import l1j.server.web.http.HttpRequestModel;

import com.google.gson.Gson;

import io.netty.handler.codec.http.FullHttpMessage;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;

public class ContentCommentInsertDefine extends HttpJsonModel {
	public ContentCommentInsertDefine() {}
	private ContentCommentInsertDefine(HttpRequestModel request, DispatcherModel model) {
		super(request, model);
	}

	@Override
	public HttpResponse get_response() throws Exception {
		if (account == null) {
			return create_response_json(HttpResponseStatus.OK, FALSE_JSON);
		}
		if (player == null) {
			return create_response_json(HttpResponseStatus.OK, FALSE_JSON);
		}
		Map<String, String> post = request.get_post_datas();
		ContentDAO dao = ContentDAO.getInstance();
		int boardId = Integer.parseInt(post.get("boardId"));
		String content = post.get("content");
		ContentCommentVO vo = new ContentCommentVO(ContentDAO.getNextAnswerNum(), boardId, player.getName(), player.getType(), player.getGender(), new Timestamp(System.currentTimeMillis()), content, new ArrayList<String>());
		dao.insertAnswer(vo);
		return create_response_json(HttpResponseStatus.OK, new Gson().toJson(vo));
	}

	@Override
	public HttpJsonModel copyInstance(HttpRequestModel request, DispatcherModel model) throws Exception {
		return new ContentCommentInsertDefine(request, model);
	}
	
	@Override
	public HttpJsonModel copyInstance(HttpRequestModel request, FullHttpMessage msg, DispatcherModel model) throws Exception {
		return null;
	}
}
