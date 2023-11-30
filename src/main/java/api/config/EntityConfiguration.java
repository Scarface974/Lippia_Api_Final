package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    CLIENT {
        @Override
        public Class<?> getEntityService() {
            return ClientService.class;
        }
    },
    TIME {
        @Override
        public Class<?> getEntityService() {
            return TimeService.class;
        }
    },

    ADDTIME {
        @Override
        public Class<?> getEntityService() {
            return AddTimeService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



