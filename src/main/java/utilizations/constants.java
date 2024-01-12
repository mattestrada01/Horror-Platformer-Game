package utilizations;

import com.example.Game;

public class constants {

    public static class UI {
        public static class Buttons {
            public static final int B_WIDTH_DEFAULT = 140;
            public static final int B_HEIGHT_DEFAULT = 56;
            public static final int B_WIDTH = (int)(B_WIDTH_DEFAULT * Game.SCALE);
            public static final int B_HEIGHT = (int)(B_HEIGHT_DEFAULT * Game.SCALE);
        }

        public static class PauseButtons {
            public static final int SOUND_DIMENSION_DEFAULT = 42;
            public static final int SOUND_DIMENSION = (int)(SOUND_DIMENSION_DEFAULT * Game.SCALE);
        }

        public static class URMButtons {
			public static final int URM_DEFAULT_SIZE = 56;
			public static final int URM_SIZE = (int) (URM_DEFAULT_SIZE * Game.SCALE);
		}

        public static class VolumeButtons {
            public static final int VOLUME_DEFAULT_WIDTH = 28;
            public static final int VOLUME_DEFAULT_HEIGHT = 44;
            public static final int SLIDER_DEFAULT_WIDTH = 215;

            public static final int SLIDER_WIDTH = (int)(SLIDER_DEFAULT_WIDTH * Game.SCALE);
            public static final int VOLUME_WIDTH = (int)(VOLUME_DEFAULT_WIDTH * Game.SCALE);
            public static final int VOLUME_HEIGHT = (int)(VOLUME_DEFAULT_HEIGHT * Game.SCALE);
        }
    }

    public static class Directions{
        public static final int LEFT = 0;
        public static final int UP = 1;
        public static final int RIGHT = 2;
        public static final int DOWN = 3;
    }

    public static class PlayerConstants {
        public static final int IDLE = 4;
        public static final int RUNNING = 6;
        public static final int JUMPING = 5;
        public static final int HIT = 3;
        public static final int ATTACK_1 = 0;
        public static final int ATTACK_2 = 1;
        public static final int DEAD = 2;
        public static final int FALLING = 7;

        public static int GetSpriteID(int player_action){
            switch(player_action) {
                case RUNNING:
                    return 8;
                case IDLE:
                    return 5;
                case HIT:
                    return 2;
                case JUMPING:
                    return 8;
                case ATTACK_1:
                    return 6;
                case ATTACK_2:
                    return 10;
                case DEAD:
                    return 5; 
                case FALLING:
                default:
                    return 1;
            }
        }
    }
}
