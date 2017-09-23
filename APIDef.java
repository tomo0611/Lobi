package com.kayac.libnakamap.net;

public class APIDef {

    public interface APICommonRequestKey {
        public static final String LANG = "lang";
        public static final String PLATFORM = "platform";
        public static final String TOKEN = "token";
        public static final String VERSION = "version";
    }

    public static final class GetAccusationCategories {
        public static final String PATH = "/1/accusation_categories";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetActivities {
        public static final String PATH = "/2/info/activity";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_LAST_CURSOR = "last_cursor";
        }
    }

    public static final class GetAdBannerPickup {
        public static final String PATH = "/2/ad/banner/pickup";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetAdInline {
        public static final String PATH = "/1/ad/inline";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String MENU_TYPES = "menu_types";
            public static final String VERSION = "version";
        }
    }

    public static final class GetAdReservations {
        public static final String PATH = "/1/ad/reservations";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetAnnouncements {
        public static final String PATH = "/2/info/announce";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_LAST_CURSOR = "last_cursor";
        }
    }

    public static final class GetApp {
        public static final String PATH = "/1/app/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String MORE_FIELD_CLIENT_ID = "client_id";
            public static final String OPTION_MORE_FIELDS = "more_fields";
            public static final String UID = "uid";
        }
    }

    public static final class GetAppCommunityInfo {
        public static final String PATH = "/1/app/%s/community_info";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String APP_UID = "app_uid";
        }
    }

    public static final class GetBanners {
        public static final String PATH = "/1/banners";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String POSITIONS = "positions";
        }

        public static final class positions {

            public static final class RequestKey {
                public static final String DISCOVERY_FEATURED = "discovery_featured";
            }
        }
    }

    public static final class GetGame {
        public static final String PATH = "/1/game/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String FIELDS_CAN_USE_REC = "can_use_rec";
            public static final String FIELDS_GRANTED_GIFT = "granted_gift";
            public static final String FIELDS_IS_BOOKMARKED = "is_bookmarked";
            public static final String FIELDS_IS_COMMENTED = "is_commented";
            public static final String FIELDS_IS_IN_GAMELIST = "is_in_gamelist";
            public static final String FIELDS_PLAYLIST_UID = "playlist_uid";
            public static final String OPTION_FIELDS = "fields";
            public static final String UID = "uid";
        }
    }

    public static final class GetGameComment {
        public static final String PATH = "/1/game/%s/comment";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_TARGET_USER_UID = "target_user";
            public static final String UID = "uid";
        }
    }

    public static final class GetGameComments {
        public static final String PATH = "/1/game/%s/comments";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetGameGenres {
        public static final String PATH = "/1/game_genres";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetGameGroups {
        public static final String PATH = "/1/game/%s/groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String COUNT = "count";
            public static final String ORDER_BY = "order_by";
            public static final String PAGE = "page";
            public static final String UID = "uid";
        }
    }

    public static final class GetGameRecommends {
        public static final String PATH = "/1/game_recommends";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String FIELDS = "fields";
        }

        public static final class fields {

            public static final class RequestKey {
                public static final String IS_ADDED_GAMELIST = "is_added_gamelist";
            }
        }
    }

    public static final class GetGameStatus {
        public static final String PATH = "/1/game/%s/game_status";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
            public static final String USER_UID = "user_uid";
        }
    }

    public static final class GetGames {
        public static final String PATH = "/1/games";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_GENRES = "genres";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_SORT = "sort";
        }

        public static final class Sort {

            public static final class RequestKey {
                public static final String HOTTEST = "hottest";
                public static final String NEWEST = "newest";
            }
        }
    }

    public static final class GetGamesSearch {
        public static final String PATH = "/1/games/search";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String COUNT = "count";
            public static final String FIELDS = "fields";
            public static final String PAGE = "page";
            public static final String f141Q = "q";
        }

        public static final class fields {

            public static final class RequestKey {
                public static final String IS_ADDED_GAMELIST = "is_added_gamelist";
            }
        }
    }

    public static final class GetGroup {
        public static final String PATH = "/1/group/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_INSTALL_ID = "install_id";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String OPTION_NEWER_THAN = "newer_than";
            public static final String OPTION_OLDER_THAN = "older_than";
            public static final String UID = "uid";
        }
    }

    public static final class GetGroupBookmarks {
        public static final String PATH = "/1/group/%s/bookmarks";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetGroupChatEditable {
        public static final String PATH = "/1/group/%s/chats/editable";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CHAT_ID = "id";
            public static final String GROUP_UID = "group_uid";
        }
    }

    public static final class GetGroupChatPokes {
        public static final String PATH = "/1/group/%s/chats/pokes";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_LIMIT = "limit";
            public static final String UID = "uid";
        }
    }

    public static final class GetGroupChatReplies {
        public static final String PATH = "/1/group/%s/chats/replies";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String TO = "to";
            public static final String UID = "uid";
        }
    }

    public static final class GetGroupChatV2 {
        public static final String PATH = "/2/group/%s/chats";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CHATS_COUNT = "count";
            public static final String OPTION_NEWER_EQUAL = "newer_equal";
            public static final String OPTION_NEWER_THAN = "newer_than";
            public static final String OPTION_OLDER_EQUAL = "older_equal";
            public static final String OPTION_OLDER_THAN = "older_than";
            public static final String UID = "uid";
        }
    }

    public static final class GetGroupChatsSearch {
        public static final String DEFAULT_COUNTS = "10";
        public static final String PATH = "/1/group/%s/chats/search";
        public static final String SORT_RECOMMEND = "recommend";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GROUP_UID = "group_uid";
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_SORT = "sort";
            public static final String f142Q = "q";
        }
    }

    public static final class GetGroupMemberChats {
        public static final String PATH = "/1/group/%s/member/%s/chats";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GROUP_UID = "group_uid";
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_NEWR_THAN = "newer_than";
            public static final String OPTION_OLDER_THAN = "older_than";
            public static final String USER_UID = "user_uid";
        }
    }

    public static final class GetGroupMembers {
        public static final String PATH = "/1/group/%s/members";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_FIELDS = "fields";
            public static final String UID = "uid";
        }

        public static final class fields {

            public static final class RequestKey {
                public static final String OWNER = "owner";
                public static final String SUBLEADERS = "subleaders";
            }
        }
    }

    public static final class GetGroupV2 {
        public static final String DEFAULT_COUNTS = "30";
        public static final String PATH = "/2/group/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_FIELDS = "fields";
            public static final String OPTION_INSTALL_ID = "install_id";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String OPTION_NEWER_EQUAL = "newer_equal";
            public static final String OPTION_NEWER_THAN = "newer_than";
            public static final String OPTION_OLDER_EQUAL = "older_equal";
            public static final String OPTION_OLDER_THAN = "older_than";
            public static final String UID = "uid";
        }

        public static final class fields {

            public static final class RequestKey {
                public static final String DISPLAY_GAME_LINK = "display_game_link";
                public static final String GAME_INFO = "game_info";
                public static final String GROUP_BOOKMARK_INFO = "group_bookmark_info";
                public static final String RESTRICTIONS_FOR_MEMBER = "restrictions_for_member";
                public static final String SUBLEADERS = "subleaders";
            }
        }
    }

    public static final class GetGroups {
        public static final String PATH = "/1/groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_WITH_ARCHIVED = "with_archived";
        }
    }

    public static final class GetGroupsBoundGames {
        public static final String PATH = "/1/groups/bound_games";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
        }
    }

    public static final class GetGroupsInvited {
        public static final String PATH = "/1/groups/invited";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
        }
    }

    public static final class GetGroupsV2 {
        public static final String PATH = "/2/groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_WITH_ARCHIVED = "with_archived";
        }
    }

    public static final class GetGroupsV3 {
        public static final String PATH = "/3/groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_WITH_ARCHIVED = "with_archived";
        }
    }

    public static final class GetMe {
        public static final String PATH = "/1/me";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_FIELDS = "fields";
        }

        public static final class fields {

            public static final class RequestKey {
                public static final String PREMIUM = "premium";
            }
        }
    }

    public static final class GetMeActivities {
        public static final String PATH = "/2/me/activity";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_LAST_CURSOR = "last_cursor";
        }
    }

    public static final class GetMeAuths {
        public static final String PATH = "/1/me/auths";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetMeBlockingUsers {
        public static final String PATH = "/1/me/blocking_users";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetMeBlockingUsersWithPaging {
        public static final String PATH = "/2/me/blocking_users";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
        }
    }

    public static final class GetMeBookmarks {
        public static final String PATH = "/1/me/bookmarks";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_GROUP_UID = "group_uid";
        }
    }

    public static final class GetMeBookmarksGroups {
        public static final String PATH = "/1/me/bookmarks/groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
        }
    }

    public static final class GetMeContacts {
        public static final String PATH = "/3/me/contacts";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
        }
    }

    public static final class GetMeContactsRecommended {
        public static final String PATH = "/1/me/contacts/recommended";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
        }
    }

    public static final class GetMeFollowers {
        public static final String PATH = "/2/me/followers";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String WITH_DEFAULT_USER = "with_default_user";
        }
    }

    public static final class GetMeGameBookmarks {
        public static final String PATH = "/1/me/game/bookmarks";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
        }
    }

    public static final class GetMeGameList {
        public static final String PATH = "/1/me/gamelist";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
        }
    }

    public static final class GetMeGameStatus {
        public static final String PATH = "/1/me/game/%s/status";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
        }
    }

    public static final class GetMeGameStatuses {
        public static final String PATH = "/1/me/game_statuses";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
        }
    }

    public static final class GetMeProfileVisibleGroups {
        public static final String PATH = "/1/me/profile/visible_groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_WITH_ARCHIVED = "with_archived";
        }
    }

    public static final class GetMeSettings {
        public static final String PATH = "/1/me/settings";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetMeSettingsNotifications {
        public static final String PATH = "/2/me/settings/notifications";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetMeSettingsV2 {
        public static final String PATH = "/2/me/settings";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetMeUsers {
        public static final String PATH = "/2/me/users";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetMyGroupsChatsSearch {
        public static final String DEFAULT_COUNTS = "10";
        public static final String PATH = "/1/groups/chats/search";
        public static final String SORT_RECOMMEND = "recommend";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_SORT = "sort";
            public static final String f143Q = "q";
        }
    }

    public static final class GetNotifications {
        public static final String PATH = "/2/info/notifications";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_LAST_CURSOR = "last_cursor";
        }
    }

    public static final class GetPlaylistItems {
        public static final String PATH = "/1/playlist/%s/items";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class GetPublicCategories {
        public static final String PATH = "/1/public_categories";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CATEGORY = "category";
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
        }
    }

    public static final class GetPublicCategoriesPickup {
        public static final String PATH = "/1/public_categories/pickup";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetPublicGroups {
        public static final String PATH = "/1/public_groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_WITH_ARCHIVED = "with_archived";
        }
    }

    public static final class GetPublicGroupsChatsSearch {
        public static final String DEFAULT_COUNTS = "10";
        public static final String PATH = "/1/public_groups/chats/search";
        public static final String REQUEST_JOINED = "1";
        public static final String SORT_RECOMMEND = "recommend";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_JOINED = "joined";
            public static final String OPTION_SORT = "sort";
            public static final String f144Q = "q";
        }
    }

    public static final class GetPublicGroupsSearch {
        public static final String PATH = "/1/public_groups/search";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CATEGORY = "category";
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_GAME_UID = "game_uid";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_Q = "q";
        }
    }

    public static final class GetPublicGroupsSpike {
        public static final String PATH = "/2/public_groups/spike";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
        }
    }

    public static final class GetPublicGroupsTreeV2 {
        public static final String PATH = "/2/public_groups/tree";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CATEGORY = "category";
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_WITH = "with";
        }
    }

    public static final class GetPublicGroupsTreeV3 {
        public static final String PATH = "/3/public_groups/tree";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_WITH = "with";
        }
    }

    public static final class GetRegion {
        public static final String PATH = "/1/regions";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetRewardStamp {
        public static final String PATH = "/1/reward/stamp";
        public static final String TYPE_AFFILIATE = "affiliate";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String TYPE = "type";
        }
    }

    public static final class GetStamps {
        public static final String PATH = "/1/stamps";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetStartup {
        public static final String PATH = "/2/startup";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String FIELDS_PREMIUM = "user/premium";
            public static final String OPTION_FIELDS = "fields";
            public static final String OPTION_LAST_ACCESSED_EPOCH = "last_accessed_epoch";
            public static final String PLATFORM = "platform";
            public static final String VERSION = "version";
        }
    }

    public static final class GetStore {
        public static final String PATH = "/1/store";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_LANG = "lang";
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_SORT = "sort";
        }
    }

    public static final class GetStoreStampDetail {
        public static final String PATH = "/1/store/stamp/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String OPTION_LANG = "lang";
        }
    }

    public static final class GetStoreSubscriptionList {
        public static final String PATH = "/1/store/subscription/list";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String VERSION = "version";
        }
    }

    public static final class GetTickets {
        public static final String PATH = "/2/tickets";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_PAGE = "page";
            public static final String OPTION_ROWS = "rows";
        }
    }

    public static final class GetTopic {
        public static final String PATH = "/1/topic/%s/";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class GetTopicV2 {
        public static final String PATH = "/2/topic/%s/";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class GetTopics {
        public static final String PATH = "/1/topics";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetTutorialGroups {
        public static final String PATH = "/1/tutorial/groups";

        public static final class RequestKey implements APICommonRequestKey {
        }
    }

    public static final class GetUser {
        public static final String PATH = "/1/user/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_GROUP = "group";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserActivities {
        public static final String PATH = "/2/user/%s/activity";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_LAST_CURSOR = "last_cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserAppusers {
        public static final String PATH = "/1/user/%s/app_users";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserContacts {
        public static final String PATH = "/2/user/%s/contacts";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserDefaultUser {
        public static final String PATH = "/1/user/%s/default_user";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String USER_UID = "user_uid";
        }
    }

    public static final class GetUserFollowers {
        public static final String PATH = "/2/user/%s/followers";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserGameList {
        public static final String PATH = "/1/user/%s/gamelist";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserGameStatus {
        public static final String PATH = "/1/user/%s/game/%s/status";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
            public static final String USER_UID = "user_uid";
        }
    }

    public static final class GetUserGameStatuses {
        public static final String PATH = "/1/user/%s/game_statuses";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_PAGE = "page";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserV2 {
        public static final String PATH = "/2/user/%s/";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_FIELDS = "fields";
            public static final String OPTION_GROUP = "group";
            public static final String UID = "uid";
        }

        public static final class fields {

            public static final class RequestKey {
                public static final String ALL = "public_groups_count,apps_count,is_blocked,gamelist,game_status,premium";
                public static final String APPS_COUNT = "apps_count";
                public static final String GAMELIST = "gamelist";
                public static final String GAME_STATUS = "game_status";
                public static final String IS_BLOCKED = "is_blocked";
                public static final String PREMIUM = "premium";
                public static final String PUBLIC_GROUPS_COUNT = "public_groups_count";
            }
        }
    }

    public static final class GetUserVisibleAppusers {
        public static final String PATH = "/1/user/%s/visible_app_users";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CURSOR = "cursor";
            public static final String UID = "uid";
        }
    }

    public static final class GetUserVisibleGroups {
        public static final String PATH = "/1/user/%s/visible_groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_COUNT = "count";
            public static final String OPTION_CURSOR = "cursor";
            public static final String OPTION_WITH_ARCHIVED = "with_archived";
            public static final String UID = "uid";
        }
    }

    public static final class GetUsersSearch {
        public static final String PATH = "/1/users/search";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String COUNT = "count";
            public static final String PAGE = "page";
            public static final String f145Q = "q";
        }
    }

    public static final class GetVersion {
        public static final String PATH = "/version";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String PLATFORM = "platform";
            public static final String VERSION = "version";
        }
    }

    public static final class GetVideo {
        public static final String PATH = "/1/video/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String VIDEO_UID = "video_uid";
        }
    }

    public static final class PostAccusations {
        public static final String PATH = "/2/accusations";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CATEGORY = "category";
            public static final String OPTION_CHAT = "chat";
            public static final String OPTION_GROUP = "group";
            public static final String OPTION_USER = "user";
            public static final String REASON = "reason";
        }
    }

    public static final class PostAdIdents {
        public static final String PATH = "/1/ad/idents";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String IDENT = "ident";
        }
    }

    public static final class PostAdReservation {
        public static final String PATH = "/1/ad/reservation/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String AD_ID = "ad_id";
            public static final String INSTALL_ID = "install_id";
            public static final String REFER = "refer";
        }
    }

    public static final class PostAdTrackingClick {
        public static final String PATH = "/1/ad/tracking/click";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String AD_ID = "ad_id";
            public static final String REFER = "refer";
        }
    }

    public static final class PostAdTrackingConversion {
        public static final String PATH = "/1/ad/tracking/conversion";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String AD_ID = "ad_id";
            public static final String INSTALL_ID = "install_id";
            public static final String REFER = "refer";
        }
    }

    public static final class PostAdTrackingImpression {
        public static final String PATH = "/1/ad/tracking/imp";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String AD_IDS = "ad_ids";
            public static final String REFER = "refer";
        }
    }

    public static final class PostAssets {
        public static final String IMAGE_JPEG = "image/jpeg";
        public static final String PATH = "/1/assets";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ASSET = "asset";
            public static final String MIME_TYPE = "mime_type";
            public static final String ORDER = "order";
        }
    }

    public static final class PostBindFinish {
        public static final String PATH = "/2/bind/finish";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String BIND_TOKEN = "bind_token";
        }
    }

    public static final class PostGameApplications {
        public static final String PATH = "/1/game_applications";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String TITLE = "title";
        }
    }

    public static final class PostGameBookmark {
        public static final String PATH = "/1/game/%s/bookmark";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGameBookmarkRemove {
        public static final String PATH = "/1/game/%s/bookmark/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGameComments {
        public static final String PATH = "/1/game/%s/comments";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String COMMENT = "comment";
            public static final String UID = "uid";
        }
    }

    public static final class PostGameCommentsRemove {
        public static final String PATH = "/1/game/%s/comment/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGameGamelist {
        public static final String PATH = "/1/game/%s/gamelist";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGameGamelistRemove {
        public static final String PATH = "/1/game/%s/gamelist/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGroup {
        public static final String PATH = "/1/group/%s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String DESCRIPTION = "description";
            public static final String NAME = "name";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupBookmarkRemove {
        public static final String PATH = "/1/group/%s/bookmark/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CHAT_ID = "chat_id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupBookmarks {
        public static final String PATH = "/1/group/%s/bookmarks";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CHAT_ID = "chat_id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupBookmarksRequest {
        public static final String PATH = "/1/group/%s/bookmarks/request";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupChat {
        public static final String PATH = "/1/group/%s/chats";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_ASSETS = "assets";
            public static final String OPTION_IMAGE = "image";
            public static final String OPTION_IMAGE_TYPE = "image_type";
            public static final String OPTION_MESSAGE = "message";
            public static final String OPTION_REPLY_TO = "reply_to";
            public static final String OPTION_TYPE = "type";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupChatBoo {
        public static final String PATH = "/1/group/%s/chats/boo";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupChatEdit {
        public static final String PATH = "/1/group/%s/chats/edit";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CHAT_ID = "id";
            public static final String GROUP_UID = "group_uid";
            public static final String OPTION_MESSAGE = "message";
        }
    }

    public static final class PostGroupChatLike {
        public static final String PATH = "/1/group/%s/chats/like";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupChatRemove {
        public static final String PATH = "/1/group/%s/chats/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupChatUnboo {
        public static final String PATH = "/1/group/%s/chats/unboo";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupChatUnlike {
        public static final String PATH = "/1/group/%s/chats/unlike";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupDisplayGameLinkDisplay {
        public static final String PATH = "/1/group/%s/user_game/display_button";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GROUP_UID = "uid";
        }
    }

    public static final class PostGroupDisplayGameLinkHide {
        public static final String PATH = "/1/group/%s/user_game/hide_button";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GROUP_UID = "uid";
        }
    }

    public static final class PostGroupExtract {
        public static final String PATH = "/1/group/%s/extract";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GROUP_UID = "group_uid";
        }
    }

    public static final class PostGroupIcon {
        public static final String PATH = "/1/group/%s/icon";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ICON = "icon";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupJoinWithGroupUid {
        public static final String PATH = "/1/group/%s/join";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CHATS_COUNT = "count";
            public static final String OPTION_INSTALL_ID = "install_id";
            public static final String OPTION_LAT = "lat";
            public static final String OPTION_LNG = "lng";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String OPTION_NEWER_THAN = "newer_than";
            public static final String OPTION_OLDER_THAN = "older_than";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupJoinWithGroupUidV2 {
        public static final String PATH = "/2/group/%s/join";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_CHATS_COUNT = "count";
            public static final String OPTION_INSTALL_ID = "install_id";
            public static final String OPTION_LAT = "lat";
            public static final String OPTION_LNG = "lng";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String OPTION_NEWER_THAN = "newer_than";
            public static final String OPTION_OLDER_THAN = "older_than";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupKick {
        public static final String PATH = "/1/group/%s/kick";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String TARGET_USER = "target_user";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupMembers {
        public static final String PATH = "/1/group/%s/members";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
            public static final String USERS = "users";
        }
    }

    public static final class PostGroupPart {
        public static final String PATH = "/1/group/%s/part";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupPrivacy {
        public static final String PATH = "/1/group/%s/privacy";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupPrivacyV2 {
        public static final String PATH = "/2/group/%s/privacy";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupPush {
        public static final String PATH = "/1/group/%s/push";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupRefuseInvitation {
        public static final String PATH = "/1/group/%s/refuse_invitation";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupRemove {
        public static final String PATH = "/1/group/%s/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupRestrictions {
        public static final String PATH = "/1/group/%s/restrictions";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ANYONE = "anyone";
            public static final String CAN_UPDATE_DESCRIPTION = "can_update_description";
            public static final String CAN_UPDATE_WALLPAPER = "can_update_wallpaper";
            public static final String GROUP_UID = "group_uid";
            public static final String LEADER = "leader";
            public static final String SUBLEADER = "subleader";
            public static final String SUPERUSER = "superuser";
        }
    }

    public static final class PostGroupSubleaders {
        public static final String PATH = "/1/group/%s/subleaders";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
            public static final String USER = "user";
        }
    }

    public static final class PostGroupSubleadersRemove {
        public static final String PATH = "/1/group/%s/subleaders/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
            public static final String USER = "user";
        }
    }

    public static final class PostGroupTransfer {
        public static final String PATH = "/1/group/%s/transfer";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String TARGET_USER = "target_user";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupUserGameBind {
        public static final String PATH = "/1/group/%s/user_game/bind";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
            public static final String GROUP_UID = "group_uid";
        }
    }

    public static final class PostGroupVisibility {
        public static final String LEVEL_FRIENDS = "1";
        public static final String LEVEL_PRIVATE = "0";
        public static final String LEVEL_PUBLIC = "2";
        public static final String PATH = "/1/group/%s/visibility";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String LEVEL = "level";
            public static final String UID = "uid";
        }
    }

    public static final class PostGroupWallpaper {
        public static final String PATH = "/1/group/%s/wallpaper";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
            public static final String WALLPAPER = "wallpaper";
        }
    }

    public static final class PostGroupWallpaperRemove {
        public static final String PATH = "/1/group/%s/wallpaper/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostGroups1on1s {
        public static final String PATH = "/1/groups/1on1s";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String USER = "user";
        }
    }

    public static final class PostGroups {
        public static final String PATH = "/1/groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String DESCRIPTION = "description";
            public static final String NAME = "name";
            public static final String OPTION_CATEGORY = "category";
            public static final String OPTION_GROUP_EX_ID = "group_ex_id";
            public static final String OPTION_MEMBER_USER_EX_IDS = "member_user_ex_ids";
            public static final String OPTION_PUBLIC = "public";
        }
    }

    public static final class PostInvitations {
        public static final String PATH = "/1/invitations";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_GROUP = "group";
        }
    }

    public static final class PostInvitationsRecipients {
        public static final String PATH = "/1/invitation/%s/recipients";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_GROUP = "group";
            public static final String UID = "uid";
        }
    }

    public static final class PostMeAuths {
        public static final String PATH = "/1/me/auths";

        public static final class Facebook {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
            }
        }

        public static final class Mixi {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
                public static final String REFRESH_TOKEN = "refresh_token";
            }
        }

        public static final class RequestKey implements APICommonRequestKey {
            public static final String SERVICE = "service";
        }

        public static final class Twitter {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
                public static final String ACCESS_TOKEN_SECRET = "access_token_secret";
            }
        }
    }

    public static final class PostMeAuthsMail {
        public static final String PATH = "/1/me/auths/mail";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String MAIL = "mail";
        }
    }

    public static final class PostMeBlockingUsers {
        public static final String PATH = "/1/me/blocking_users";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String USERS = "users";
        }
    }

    public static final class PostMeBlockingUsersRemove {
        public static final String PATH = "/1/me/blocking_users/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String USERS = "users";
        }
    }

    public static final class PostMeBookmarkRemove {
        public static final String PATH = "/1/me/bookmark/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CHAT_ID = "chat_id";
        }
    }

    public static final class PostMeBookmarks {
        public static final String PATH = "/1/me/bookmarks";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String CHAT_ID = "chat_id";
        }
    }

    public static final class PostMeContacts {
        public static final String PATH = "/1/me/contacts";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String RECOMMENDED = "recommended";
            public static final String USERS = "users";
        }
    }

    public static final class PostMeContactsRemove {
        public static final String PATH = "/1/me/contacts/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String USER = "user";
        }
    }

    public static final class PostMeCover {
        public static final String PATH = "/1/me/cover";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String COVER = "cover";
        }
    }

    public static final class PostMeExternalContacts {
        public static final String PATH = "/2/me/external_contacts";

        public static final class Email {

            public static final class RequestKey {
                public static final String EMAILS = "emails";
            }
        }

        public static final class Facebook {

            public static final class RequestKey {
                public static final String IDS = "ids";
            }
        }

        public static final class Mixi {

            public static final class RequestKey {
                public static final String IDS = "ids";
            }
        }

        public static final class RequestKey implements APICommonRequestKey {
            public static final String SERVICE = "service";
        }

        public static final class Twitter {

            public static final class RequestKey {
                public static final String SCREEN_NAMES = "screen_names";
            }
        }
    }

    public static final class PostMeGameStatusImages {
        public static final String PATH = "/1/me/game/%s/status/images";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
            public static final String IMAGE = "image";
        }
    }

    public static final class PostMeGameStatusRemove {
        public static final String PATH = "/1/me/game/%s/status/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
        }
    }

    public static final class PostMeGameStatusRemoveImage {
        public static final String PATH = "/1/me/game/%s/status/remove_image";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GAME_UID = "game_uid";
            public static final String IMAGE_ID = "image_id";
        }
    }

    public static final class PostMeGameStatuses {
        public static final String PATH = "/1/me/game/%s/statuses";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String DESCRIPTION = "description";
            public static final String GAME_UID = "game_uid";
        }
    }

    public static final class PostMeGcmRegistrationId {
        public static final String PATH = "/1/me/gcm_registration_id";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String REGISTRATION_ID = "registration_id";
        }
    }

    public static final class PostMeIcon {
        public static final String PATH = "/1/me/icon";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ICON = "icon";
            public static final String OPTION_FORCE = "force";
        }
    }

    public static final class PostMeProfile {
        public static final String PATH = "/1/me/profile";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String OPTION_DESCRIPTION = "description";
            public static final String OPTION_NAME = "name";
        }
    }

    public static final class PostMeRemoveComplete {
        public static final String PATH = "/1/me/remove/complete";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String REMOVE_TOKEN = "remove_token";
        }
    }

    public static final class PostMeRemoveConfirm {
        public static final String PATH = "/1/me/remove/confirm";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String WHY = "why";
        }
    }

    public static final class PostMeSettingsAutoAddContacts {
        public static final String PATH = "/1/me/settings/auto_add_contacts";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
            public static final String TYPE = "type";
        }
    }

    public static final class PostMeSettingsBindGroupGame {
        public static final String PATH = "/1/me/settings/bind_group_game";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
        }
    }

    public static final class PostMeSettingsNotifications {
        public static final String PATH = "/2/me/settings/notifications";
        public static final String TYPE_ALL = "all";
        public static final String TYPE_CHAT_BOOKMARK = "chat_bookmark";
        public static final String TYPE_CHAT_POKE = "chat_poke";
        public static final String TYPE_GROUP_INVITATION = "group_invitation";
        public static final String TYPE_REPLY_RECEIVED = "reply_received";
        public static final String TYPE_TICKET_REMIND = "ticket_remind";
        public static final String TYPE_TICKET_RESULT = "ticket_result";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String NOTIFICATION = "notification";
            public static final String PUSH = "push";
            public static final String TYPE = "type";
            public static final String USER = "user";
        }
    }

    public static final class PostMeSettingsPasswordRenewPassword {
        public static final String PATH = "/1/me/settings/password/renew_password";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String KEY_TYPE = "type";
            public static final String VALUE_TYPE_CHANGE = "change";
            public static final String VALUE_TYPE_NOSETTING = "no_setting";
        }
    }

    public static final class PostMeSettingsPublishContacts {
        public static final String PATH = "/1/me/settings/publish_contacts";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ALL = "all";
            public static final String LEVEL = "level";
        }
    }

    public static final class PostMeSettingsPush {
        public static final String PATH = "/1/me/settings/push";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ENABLED_TYPE = "enabledType";
            public static final String OPTION_ENABLED_FROM = "enabledFrom";
            public static final String OPTION_ENABLED_TIL = "enabledTil";
            public static final String OPTION_TIME_ZONE = "timeZone";
        }
    }

    public static final class PostMeSettingsPushNotifications {
        public static final String PATH = "/1/me/settings/push_notifications";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
        }
    }

    public static final class PostMeSettingsPushSound {
        public static final String PATH = "/1/me/settings/push_sound";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String SOUND = "sound";
        }
    }

    public static final class PostMeSettingsReciveFriendsNotice {
        public static final String PATH = "/1/me/settings/receive_friends_notice";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
        }
    }

    public static final class PostMeSettingsReciveNewsNotice {
        public static final String PATH = "/1/me/settings/receive_news_notice";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
        }
    }

    public static final class PostMeSettingsSearchable {
        public static final String PATH = "/1/me/settings/searchable";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ON = "on";
        }
    }

    public static final class PostNotifyContacts {
        public static final String EVENT_JOINED_GROUP = "joined_group";
        public static final String EVENT_STARTED_APP = "started_app";
        public static final String PATH = "/1/notify_contacts";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String EVENT = "event";
            public static final String OPTION_APP = "app";
            public static final String OPTION_GROUP = "group";
        }
    }

    public static final class PostPasswordResetConfirmation {
        public static final String PATH = "/1/password_reset_confirmation";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String DEVICE_UUID = "device_uuid";
            public static final String SIGNATURE = "sig";
            public static final String SPELL = "spell";
        }
    }

    public static final class PostPublicGroups {
        public static final String PATH = "/1/public_groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String NAME = "name";
            public static final String OPTION_CATEGORY = "category";
            public static final String OPTION_DESCRIPTION = "description";
            public static final String OPTION_GAME_UID = "game_uid";
        }
    }

    public static final class PostRegion {
        public static final String PATH = "/1/me/region";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String REGION_ID = "region_id";
        }
    }

    public static final class PostRemoveActivity {
        public static final String PATH = "/1/me/activity/remove";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String ID = "id";
        }
    }

    public static final class PostSeparate {
        public static final String PATH = "/1/separate";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String TARGET_USER = "target_user";
        }
    }

    public static final class PostSignin {
        public static final String PATH = "/1/signin";
        public static final String SERVICE_NAME_FACEBOOK = "facebook";
        public static final String SERVICE_NAME_TWITTER = "twitter";

        public static final class Email {

            public static final class RequestKey {
                public static final String MAIL = "mail";
                public static final String NAME = "name";
            }
        }

        public static final class Facebook {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
            }
        }

        public static final class RequestKey {
            public static final String DEVICE_UUID = "device_uuid";
            public static final String SERVICE = "service";
        }

        public static final class Twitter {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
                public static final String ACCESS_TOKEN_SECRET = "access_token_secret";
            }
        }
    }

    public static final class PostSigninConfirmation {
        public static final String PATH = "/1/signin_confirmation";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String DEVICE_UUID = "device_uuid";
            public static final String SIGNATURE = "sig";
            public static final String SPELL = "spell";
        }
    }

    public static final class PostSignup {
        public static final String PATH = "/1/signup";
        public static final String SERVICE_NAME_FACEBOOK = "facebook";
        public static final String SERVICE_NAME_TWITTER = "twitter";

        public static final class Email {

            public static final class RequestKey {
                public static final String MAIL = "mail";
                public static final String NAME = "name";
            }
        }

        public static final class Facebook {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
            }
        }

        public static final class RequestKey {
            public static final String DEVICE_UUID = "device_uuid";
            public static final String SERVICE = "service";
        }

        public static final class Twitter {

            public static final class RequestKey {
                public static final String ACCESS_TOKEN = "access_token";
                public static final String ACCESS_TOKEN_SECRET = "access_token_secret";
            }
        }
    }

    public static final class PostSignupConfirmation {
        public static final String PATH = "/1/signup_confirmation";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String DEVICE_UUID = "device_uuid";
            public static final String SIGNATURE = "sig";
            public static final String SPELL = "spell";
        }
    }

    public static final class PostStampUnlock {
        public static final String PATH = "/1/stamp/%s/unlock";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String UID = "uid";
        }
    }

    public static final class PostStoreRestore {
        public static final String PATH = "/1/store/restore";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String PLATFORM = "platform";
            public static final String SIGNATURE = "signature";
            public static final String SIGNED_DATA = "signed_data";
            public static final String STAMP_UID = "stamp_uid";
        }
    }

    public static final class PostStoreStampUnlock {
        public static final String PATH = "/1/store/stamp/unlock";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String SIGNATURE = "signature";
            public static final String SIGNED_DATA = "signed_data";
            public static final String STAMP_UID = "stamp_uid";
        }
    }

    public static final class PostStoreSubscriptionPurchase {
        public static final String PATH = "/1/store/subscription/purchase";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String PAYMENT_AGENCY = "payment_agency";
            public static final String SIGNATURE = "signature";
            public static final String SIGNED_DATA = "signed_data";
        }
    }

    public static final class PostStoreSubscriptionRestore {
        public static final String PATH = "/1/store/subscription/restore";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String PLATFORM = "platform";
            public static final String RECEIPT = "receipt";
            public static final String SIGNATURE = "signature";
            public static final String SIGNED_DATA = "signed_data";
        }
    }

    public static final class PostTutorialJoinInitialGroups {
        public static final String PATH = "/1/tutorial/join_initial_groups";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String GROUP_UID = "group_uid";
            public static final String OPTION_CHATS_COUNT = "count";
            public static final String OPTION_INSTALL_ID = "install_id";
            public static final String OPTION_LAT = "lat";
            public static final String OPTION_LNG = "lng";
            public static final String OPTION_MEMBERS_COUNT = "members_count";
            public static final String OPTION_MEMBERS_CURSOR = "members_cursor";
            public static final String OPTION_NEWER_THAN = "newer_than";
            public static final String OPTION_OLDER_THAN = "older_than";
        }
    }

    public static final class PostUserVisibility {
        public static final String PATH = "/1/user/%s/visibility";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String LEVEL = "level";
            public static final String UID = "uid";
        }
    }

    public static final class PostVideoViews {
        public static final String PATH = "/1/video/%s/views";

        public static final class RequestKey implements APICommonRequestKey {
            public static final String VIDEO_UID = "video_uid";
        }
    }
}
